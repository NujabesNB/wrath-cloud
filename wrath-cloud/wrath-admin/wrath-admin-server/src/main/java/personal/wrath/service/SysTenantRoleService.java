

package personal.wrath.service;


import personal.wrath.commons.mybatis.service.BaseService;
import personal.wrath.commons.tools.page.PageData;
import personal.wrath.dto.SysRoleDTO;
import personal.wrath.entity.SysRoleEntity;

import java.util.List;
import java.util.Map;


/**
 * 租户角色
 * 
 * @author Mark sunlightcs@gmail.com
 */
public interface SysTenantRoleService extends BaseService<SysRoleEntity> {

	PageData<SysRoleDTO> page(Map<String, Object> params);

	List<SysRoleDTO> list(Map<String, Object> params);

	SysRoleDTO get(Long id);

	void save(SysRoleDTO dto);

	void update(SysRoleDTO dto);

	void delete(Long[] ids);

}
