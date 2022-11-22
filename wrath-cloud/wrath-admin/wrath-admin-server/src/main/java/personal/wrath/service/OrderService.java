

package personal.wrath.service;

import personal.wrath.commons.mybatis.service.CrudService;
import personal.wrath.dto.OrderDTO;
import personal.wrath.entity.OrderEntity;

/**
 * 订单
 *
 * @author Mark sunlightcs@gmail.com
 */
public interface OrderService extends CrudService<OrderEntity, OrderDTO> {


    OrderEntity getByOrderId(Long orderId);

    /**
     * 支付成功
     * @param order 订单
     */
    void paySuccess(OrderEntity order);
}