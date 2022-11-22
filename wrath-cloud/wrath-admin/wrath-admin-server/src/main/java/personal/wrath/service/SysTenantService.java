

package personal.wrath.service;

import personal.wrath.commons.mybatis.service.BaseService;
import personal.wrath.commons.tools.page.PageData;
import personal.wrath.dto.SysTenantDTO;
import personal.wrath.entity.SysTenantEntity;

import java.util.Map;


/**
 * 租户管理
 * 
 * @author Mark sunlightcs@gmail.com
 */
public interface SysTenantService extends BaseService<SysTenantEntity> {

	PageData<SysTenantDTO> page(Map<String, Object> params);

	SysTenantDTO get(Long id);

	void save(SysTenantDTO dto);

	void update(SysTenantDTO dto);

	void delete(Long[] ids);

	SysTenantDTO getTenantCode(Long tenantCode);
}
