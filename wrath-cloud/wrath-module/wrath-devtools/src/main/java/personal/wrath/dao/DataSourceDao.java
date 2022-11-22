

package personal.wrath.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import personal.wrath.entity.DataSourceEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 数据源管理
 *
 * @author Mark sunlightcs@gmail.com
 */
@Mapper
public interface DataSourceDao extends BaseMapper<DataSourceEntity> {
	
}