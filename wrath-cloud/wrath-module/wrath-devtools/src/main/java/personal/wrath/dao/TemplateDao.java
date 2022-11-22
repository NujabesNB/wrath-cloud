

package personal.wrath.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import personal.wrath.entity.TemplateEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

/**
 * 模板管理
 *
 * @author Mark sunlightcs@gmail.com
 */
@Mapper
public interface TemplateDao extends BaseMapper<TemplateEntity> {

    int updateStatusBatch(Map<String, Object> map);
}