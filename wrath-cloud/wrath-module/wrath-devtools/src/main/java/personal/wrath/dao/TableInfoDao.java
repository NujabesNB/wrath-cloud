

package personal.wrath.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import personal.wrath.entity.TableInfoEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 列
 *
 * @author Mark sunlightcs@gmail.com
 */
@Mapper
public interface TableInfoDao extends BaseMapper<TableInfoEntity> {
    TableInfoEntity getByTableName(String tableName);

    void deleteByTableName(String tableName);
}
