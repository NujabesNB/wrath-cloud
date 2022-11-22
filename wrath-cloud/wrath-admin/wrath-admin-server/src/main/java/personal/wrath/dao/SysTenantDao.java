

package personal.wrath.dao;

import personal.wrath.commons.mybatis.dao.BaseDao;
import personal.wrath.entity.SysTenantEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 租户管理
 *
 * @author Mark sunlightcs@gmail.com
 */
@Mapper
public interface SysTenantDao extends BaseDao<SysTenantEntity> {

    List<SysTenantEntity> getList(Map<String, Object> params);

    SysTenantEntity getById(Long id);

    SysTenantEntity getTenantCode(Long tenantCode);

    void deleteBatch(Long[] ids);
}