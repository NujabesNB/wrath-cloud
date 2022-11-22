

package personal.wrath.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import personal.wrath.commons.mybatis.service.impl.BaseServiceImpl;
import personal.wrath.commons.tools.enums.DeleteEnum;
import personal.wrath.commons.tools.enums.SuperAdminEnum;
import personal.wrath.commons.tools.enums.SuperTenantEnum;
import personal.wrath.commons.tools.enums.SysTenantEnum;
import personal.wrath.commons.tools.exception.ErrorCode;
import personal.wrath.commons.tools.exception.RenException;
import personal.wrath.commons.tools.page.PageData;
import personal.wrath.commons.tools.utils.ConvertUtils;
import personal.wrath.dao.SysTenantDao;
import personal.wrath.dao.SysUserDao;
import personal.wrath.dto.SysTenantDTO;
import personal.wrath.entity.SysTenantEntity;
import personal.wrath.entity.SysUserEntity;
import personal.wrath.service.SysRoleUserService;
import personal.wrath.service.SysTenantService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;


/**
 * 租户管理
 * 
 * @author Mark sunlightcs@gmail.com
 */
@Service
public class SysTenantServiceImpl extends BaseServiceImpl<SysTenantDao, SysTenantEntity> implements SysTenantService {
	@Autowired
	private SysRoleUserService sysRoleUserService;
	@Autowired
	private SysUserDao sysUserDao;
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public PageData<SysTenantDTO> page(Map<String, Object> params) {
		//转换成like
		paramsToLike(params, "tenantName");

		//分页
		IPage<SysTenantEntity> page = getPage(params, "t1.create_date", false);

		//查询
		List<SysTenantEntity> list = baseDao.getList(params);

		return getPageData(list, page.getTotal(), SysTenantDTO.class);
	}

	@Override
	public SysTenantDTO get(Long id) {
		SysTenantEntity entity = baseDao.getById(id);

		return ConvertUtils.sourceToTarget(entity, SysTenantDTO.class);
	}

	@Override
	public SysTenantDTO getTenantCode(Long tenantCode) {
		SysTenantEntity entity = baseDao.getTenantCode(tenantCode);

		return ConvertUtils.sourceToTarget(entity, SysTenantDTO.class);
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void save(SysTenantDTO dto) {
		SysTenantEntity entity = ConvertUtils.sourceToTarget(dto, SysTenantEntity.class);

		//账号已存在
		SysUserEntity userEntity = sysUserDao.getByUsername(dto.getUsername());
		if(userEntity != null){
			throw new RenException(ErrorCode.ACCOUNT_EXIST);
		}

		//保存用户
		userEntity = ConvertUtils.sourceToTarget(dto, SysUserEntity.class);
		userEntity.setPassword(passwordEncoder.encode(dto.getPassword()));
		userEntity.setSuperTenant(SuperTenantEnum.YES.value());
		userEntity.setSuperAdmin(SuperAdminEnum.NO.value());
		userEntity.setGender(2);
		sysUserDao.insert(userEntity);

		//保存角色用户关系
		sysRoleUserService.saveOrUpdate(userEntity.getId(), dto.getRoleIdList());

		//保存租户
		entity.setUserId(userEntity.getId());
		entity.setDelFlag(DeleteEnum.NO.value());
		entity.setSysTenant(SysTenantEnum.NO.value());
		insert(entity);

	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	public void update(SysTenantDTO dto) {
		//更新租户
		SysTenantEntity entity = ConvertUtils.sourceToTarget(dto, SysTenantEntity.class);
		updateById(entity);

		//查询租户用户ID
		Long userId = baseDao.selectById(entity.getId()).getUserId();

		//更新用户
		SysUserEntity userEntity = ConvertUtils.sourceToTarget(dto, SysUserEntity.class);
		userEntity.setId(userId);
		//密码加密
		if(StringUtils.isBlank(dto.getPassword())){
			userEntity.setPassword(null);
		}else{
			String password = passwordEncoder.encode(dto.getPassword());
			userEntity.setPassword(password);
		}
		sysUserDao.updateById(userEntity);

		//更新角色用户关系
		sysRoleUserService.saveOrUpdate(userEntity.getId(), dto.getRoleIdList());
	}

	@Override
	public void delete(Long[] ids) {
		baseDao.deleteBatch(ids);
	}
}
