

package personal.wrath.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import personal.wrath.entity.BaseClassEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 基类管理
 *
 * @author Mark sunlightcs@gmail.com
 */
@Mapper
public interface BaseClassDao extends BaseMapper<BaseClassEntity> {
	
}