

package personal.wrath.controller;

 import personal.wrath.commons.log.annotation.LogOperation;
 import personal.wrath.commons.security.user.SecurityUser;
 import personal.wrath.commons.security.user.UserDetail;
 import personal.wrath.commons.tools.constant.Constant;
import personal.wrath.commons.security.context.TenantContext;
import personal.wrath.commons.tools.exception.ErrorCode;
import personal.wrath.commons.tools.page.PageData;
import personal.wrath.commons.tools.utils.ConvertUtils;
import personal.wrath.commons.tools.utils.ExcelUtils;
import personal.wrath.commons.tools.utils.Result;
import personal.wrath.commons.tools.validator.AssertUtils;
import personal.wrath.commons.tools.validator.ValidatorUtils;
import personal.wrath.commons.tools.validator.group.AddGroup;
import personal.wrath.commons.tools.validator.group.DefaultGroup;
import personal.wrath.commons.tools.validator.group.UpdateGroup;
import personal.wrath.dto.PasswordDTO;
 import personal.wrath.dto.SysTenantDTO;
 import personal.wrath.dto.SysUserDTO;
import personal.wrath.excel.SysUserExcel;
import personal.wrath.service.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
 import org.springframework.security.core.GrantedAuthority;
 import org.springframework.security.core.authority.SimpleGrantedAuthority;
 import org.springframework.security.crypto.password.PasswordEncoder;
 import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
 import java.util.HashSet;
 import java.util.List;
import java.util.Map;
 import java.util.Set;
 import java.util.stream.Collectors;

/**
 * 用户管理
 *
 * @author Mark sunlightcs@gmail.com
 * @since 1.0.0
 */
@RestController
@RequestMapping("user")
@Api(tags="用户管理")
public class SysUserController {
    @Autowired
    private SysUserService sysUserService;
    @Autowired
    private SysRoleUserService sysRoleUserService;
    @Autowired
    private SysRoleDataScopeService sysRoleDataScopeService;
    @Autowired
    private SysTenantService sysTenantService;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private SysMenuService sysMenuService;
    @Autowired
    private SysUserPostService sysUserPostService;

    @GetMapping("page")
    @ApiOperation("分页")
    @ApiImplicitParams({
        @ApiImplicitParam(name = Constant.PAGE, value = "当前页码，从1开始", paramType = "query", required = true, dataType="int") ,
        @ApiImplicitParam(name = Constant.LIMIT, value = "每页显示记录数", paramType = "query",required = true, dataType="int") ,
        @ApiImplicitParam(name = Constant.ORDER_FIELD, value = "排序字段", paramType = "query", dataType="String") ,
        @ApiImplicitParam(name = Constant.ORDER, value = "排序方式，可选值(asc、desc)", paramType = "query", dataType="String") ,
        @ApiImplicitParam(name = "username", value = "用户名", paramType = "query", dataType="String"),
        @ApiImplicitParam(name = "postId", value = "岗位ID", paramType = "query", dataType="String")
    })
    @PreAuthorize("hasAuthority('sys:user:page')")
    public Result<PageData<SysUserDTO>> page(@ApiIgnore @RequestParam Map<String, Object> params){
        PageData<SysUserDTO> page = sysUserService.page(params);

        return new Result<PageData<SysUserDTO>>().ok(page);
    }

    @GetMapping("{id}")
    @ApiOperation("信息")
    @PreAuthorize("hasAuthority('sys:user:info')")
    public Result<SysUserDTO> get(@PathVariable("id") Long id){
        SysUserDTO data = sysUserService.get(id);

        //用户角色列表
        List<Long> roleIdList = sysRoleUserService.getRoleIdList(id);
        data.setRoleIdList(roleIdList);

        //用户岗位列表
        List<Long> postIdList = sysUserPostService.getPostIdList(id);
        data.setPostIdList(postIdList);

        return new Result<SysUserDTO>().ok(data);
    }

    @GetMapping("info")
    @ApiOperation("登录用户信息")
    public Result<SysUserDTO> info(){
        UserDetail user = SecurityUser.getUser();
        SysUserDTO data = ConvertUtils.sourceToTarget(user, SysUserDTO.class);

        //当前用户所在租户
        SysTenantDTO tenant = sysTenantService.getTenantCode(TenantContext.getTenantCode(user));
        data.setTenantName(tenant.getTenantName());

        return new Result<SysUserDTO>().ok(data);
    }

    @PostMapping
    @ApiOperation("保存")
    @LogOperation("Save User")
    @PreAuthorize("hasAuthority('sys:user:save')")
    public Result save(@RequestBody SysUserDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, AddGroup.class, DefaultGroup.class);

        sysUserService.save(dto);

        return new Result();
    }

    @PutMapping
    @ApiOperation("修改")
    @LogOperation("Update User")
    @PreAuthorize("hasAuthority('sys:user:update')")
    public Result update(@RequestBody SysUserDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, UpdateGroup.class, DefaultGroup.class);

        sysUserService.update(dto);

        return new Result();
    }

    @PutMapping("password")
    @ApiOperation("修改密码")
    @LogOperation("Password User")
    public Result password(@RequestBody PasswordDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto);

        UserDetail user = SecurityUser.getUser();

        //原密码不正确
        if(!passwordEncoder.matches(dto.getPassword(), user.getPassword())){
            return new Result().error(ErrorCode.PASSWORD_ERROR);
        }

        sysUserService.updatePassword(user.getId(), dto.getNewPassword());

        return new Result();
    }

    @DeleteMapping
    @ApiOperation("删除")
    @LogOperation("Delete User")
    @PreAuthorize("hasAuthority('sys:user:delete')")
    public Result delete(@RequestBody Long[] ids){
        //效验数据
        AssertUtils.isArrayEmpty(ids, "id");

        sysUserService.delete(ids);

        return new Result();
    }

    @GetMapping("export")
    @ApiOperation("导出")
    @LogOperation("Export User")
    @PreAuthorize("hasAuthority('sys:user:export')")
    @ApiImplicitParam(name = "username", value = "用户名", paramType = "query", dataType="String")
    public void export(@ApiIgnore @RequestParam Map<String, Object> params, HttpServletResponse response) throws Exception {
        List<SysUserDTO> list = sysUserService.list(params);

        ExcelUtils.exportExcelToTarget(response, null, "用户管理", list, SysUserExcel.class);
    }

    /**
     * 根据用户名，获取用户信息
     */
    @PostMapping("getByUsername")
    public Result<UserDetail> getByUsername(String username){
        SysUserDTO user = sysUserService.getByUsername(username);

        UserDetail userDetail = ConvertUtils.sourceToTarget(user, UserDetail.class);
        //初始化用户数据
        initUserData(userDetail);

        return new Result<UserDetail>().ok(userDetail);
    }

    /**
     * 根据用户Id，获取用户信息
     */
    @GetMapping("getById")
    public Result<UserDetail> getById(Long id){
        SysUserDTO user = sysUserService.get(id);

        UserDetail userDetail = ConvertUtils.sourceToTarget(user, UserDetail.class);
        //初始化用户数据
        initUserData(userDetail);

        return new Result<UserDetail>().ok(userDetail);
    }

    /**
     * 初始化用户数据
     */
    private void initUserData(UserDetail userDetail){
        if(userDetail == null){
            return;
        }

        //用户部门数据权限
        List<Long> deptIdList = sysRoleDataScopeService.getDataScopeList(userDetail.getId());
        userDetail.setDeptIdList(deptIdList);

        //获取用户权限标识
        Set<String> permsSet = sysMenuService.getUserPermissions(userDetail);
        //封装权限标识
        Set<GrantedAuthority> authorities = new HashSet<>();
        authorities.addAll(permsSet.stream().map(SimpleGrantedAuthority::new).collect(Collectors.toSet()));
        userDetail.setAuthorities(authorities);
    }

}