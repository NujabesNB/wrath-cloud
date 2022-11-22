
package personal.wrath.dao;

import personal.wrath.commons.mybatis.dao.BaseDao;
import personal.wrath.entity.StorageEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
* 库存
*
* @author Mark sunlightcs@gmail.com
*/
@Mapper
public interface StorageDao extends BaseDao<StorageEntity> {

    /**
     * 减库存，需要保证不会超卖
     * @param commodityCode   商品编码
     * @param count           数量
     * @return                大于0，表示成功，否则没库存
     */
	int updateDeduct(@Param("commodityCode") String commodityCode, @Param("count") Integer count);
}