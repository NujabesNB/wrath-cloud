

package personal.wrath.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import personal.wrath.commons.mybatis.service.impl.BaseServiceImpl;
import personal.wrath.commons.security.user.SecurityUser;
import personal.wrath.commons.tools.constant.Constant;
import personal.wrath.commons.security.context.TenantContext;
import personal.wrath.commons.tools.enums.SuperAdminEnum;
import personal.wrath.commons.tools.enums.SuperTenantEnum;
import personal.wrath.commons.tools.page.PageData;
import personal.wrath.commons.security.user.UserDetail;
import personal.wrath.commons.tools.utils.ConvertUtils;
import personal.wrath.dao.SysUserDao;
import personal.wrath.dto.SysUserDTO;
import personal.wrath.entity.SysUserEntity;
import personal.wrath.service.SysDeptService;
import personal.wrath.service.SysRoleUserService;
import personal.wrath.service.SysUserPostService;
import personal.wrath.service.SysUserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * 用户管理
 *
 * @author Mark sunlightcs@gmail.com
 * @since 1.0.0
 */
@Service
public class SysUserServiceImpl extends BaseServiceImpl<SysUserDao, SysUserEntity> implements SysUserService {
    @Autowired
    private SysRoleUserService sysRoleUserService;
    @Autowired
    private SysDeptService sysDeptService;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private SysUserPostService sysUserPostService;

    @Override
    public PageData<SysUserDTO> page(Map<String, Object> params) {
        //转换成like
        paramsToLike(params, "username");

        //分页
        IPage<SysUserEntity> page = getPage(params, Constant.CREATE_DATE, false);

        //查询
        List<SysUserEntity> list = baseDao.getList(getQueryParams(params));

        return getPageData(list, page.getTotal(), SysUserDTO.class);
    }

    @Override
    public List<SysUserDTO> list(Map<String, Object> params) {
        List<SysUserEntity> entityList = baseDao.getList(getQueryParams(params));

        return ConvertUtils.sourceToTarget(entityList, SysUserDTO.class);
    }

    private Map<String, Object> getQueryParams(Map<String, Object> params){
        //普通管理员，只能查询所属部门及子部门的数据
        UserDetail user = SecurityUser.getUser();
        if(user.getSuperAdmin() == SuperAdminEnum.NO.value()
                && user.getSuperTenant() == SuperTenantEnum.NO.value()) {
            params.put("deptIdList", sysDeptService.getSubDeptIdList(user.getDeptId()));
        }

        //租户
        params.put(Constant.TENANT_CODE, TenantContext.getTenantCode(user));

        return params;
    }

    @Override
    public SysUserDTO get(Long id) {
        SysUserEntity entity = baseDao.getById(id);

        return ConvertUtils.sourceToTarget(entity, SysUserDTO.class);
    }

    @Override
    public SysUserDTO getByUsername(String username) {
        SysUserEntity entity = baseDao.getByUsername(username);
        return ConvertUtils.sourceToTarget(entity, SysUserDTO.class);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void save(SysUserDTO dto) {
        SysUserEntity entity = ConvertUtils.sourceToTarget(dto, SysUserEntity.class);

        //密码加密
        String password = passwordEncoder.encode(entity.getPassword());
        entity.setPassword(password);

        //保存用户
        entity.setSuperTenant(SuperTenantEnum.NO.value());
        entity.setSuperAdmin(SuperAdminEnum.NO.value());
        entity.setTenantCode(TenantContext.getTenantCode(SecurityUser.getUser()));
        insert(entity);

        //保存角色用户关系
        sysRoleUserService.saveOrUpdate(entity.getId(), dto.getRoleIdList());

        //保存用户岗位关系
        sysUserPostService.saveOrUpdate(entity.getId(), dto.getPostIdList());
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void update(SysUserDTO dto) {
        SysUserEntity entity = ConvertUtils.sourceToTarget(dto, SysUserEntity.class);

        //密码加密
        if(StringUtils.isBlank(dto.getPassword())){
            entity.setPassword(null);
        }else{
            String password = passwordEncoder.encode(entity.getPassword());
            entity.setPassword(password);
        }

        //更新用户
        updateById(entity);

        //更新角色用户关系
        sysRoleUserService.saveOrUpdate(entity.getId(), dto.getRoleIdList());

        //保存用户岗位关系
        sysUserPostService.saveOrUpdate(entity.getId(), dto.getPostIdList());
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void delete(Long[] ids) {
        //逻辑删除
        logicDelete(ids, SysUserEntity.class);

        //角色用户关系，岗位关系需要保留，不然逻辑删除就变成物理删除了
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void updatePassword(Long id, String newPassword) {
        newPassword = passwordEncoder.encode(newPassword);

        baseDao.updatePassword(id, newPassword);
    }

    @Override
    public int getCountByDeptId(Long deptId) {
        return baseDao.getCountByDeptId(deptId);
    }

    @Override
    public List<Long> getUserIdListByDeptId(List<Long> deptIdList) {
        return baseDao.getUserIdListByDeptId(deptIdList);
    }
}