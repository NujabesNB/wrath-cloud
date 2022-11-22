
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

    /**
     * 创建订单、减库存，涉及到两个服务
     * @param commodityCode   商品编码
     * @param count           数量
     */
    void createOrder(String commodityCode, Integer count);
}