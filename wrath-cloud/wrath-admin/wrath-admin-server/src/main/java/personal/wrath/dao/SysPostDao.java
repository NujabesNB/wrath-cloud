

package personal.wrath.dao;

import personal.wrath.commons.mybatis.dao.BaseDao;
import personal.wrath.entity.SysPostEntity;
import org.apache.ibatis.annotations.Mapper;

/**
* 岗位管理
*
* @author Mark sunlightcs@gmail.com
*/
@Mapper
public interface SysPostDao extends BaseDao<SysPostEntity> {
	
}