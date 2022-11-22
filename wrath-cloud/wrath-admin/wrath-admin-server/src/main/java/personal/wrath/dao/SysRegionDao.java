package personal.wrath.dao;

import personal.wrath.commons.mybatis.dao.BaseDao;
import personal.wrath.entity.SysRegionEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 行政区域
 *
 * @author Mark sunlightcs@gmail.com
 */
@Mapper
public interface SysRegionDao extends BaseDao<SysRegionEntity> {

	List<SysRegionEntity> getList(Map<String, Object> params);

	List<SysRegionEntity> getListByLevel(Integer treeLevel);

	List<Map<String, Object>> getTreeList();

	SysRegionEntity getById(Long id);

	int getCountByPid(Long pid);

}