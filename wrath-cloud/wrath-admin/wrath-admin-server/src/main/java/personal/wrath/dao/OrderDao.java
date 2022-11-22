

package personal.wrath.dao;

import personal.wrath.commons.mybatis.dao.BaseDao;
import personal.wrath.entity.OrderEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Date;

/**
* 订单
*
* @author Mark sunlightcs@gmail.com
*/
@Mapper
public interface OrderDao extends BaseDao<OrderEntity> {

    /**
     * 支付成功
     */
    int paySuccess(@Param("orderId") Long orderId, @Param("status") Integer status, @Param("payAt") Date payAt);

    OrderEntity getByOrderId(Long orderId);
}