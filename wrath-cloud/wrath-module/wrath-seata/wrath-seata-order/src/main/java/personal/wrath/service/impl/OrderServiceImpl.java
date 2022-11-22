
package personal.wrath.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import personal.wrath.commons.mybatis.service.impl.CrudServiceImpl;
import personal.wrath.commons.tools.exception.RenException;
import personal.wrath.commons.tools.utils.Result;
import personal.wrath.dao.OrderDao;
import personal.wrath.dto.OrderDTO;
import personal.wrath.entity.OrderEntity;
import personal.wrath.feign.StorageFeignClient;
import personal.wrath.service.OrderService;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.Map;

/**
 * 订单
 *
 * @author Mark sunlightcs@gmail.com
 */
@Service
public class OrderServiceImpl extends CrudServiceImpl<OrderDao, OrderEntity, OrderDTO> implements OrderService {
    @Autowired
    private StorageFeignClient storageFeignClient;

    /**
     * 创建订单、减库存，涉及到两个服务
     * @param commodityCode   商品编码
     * @param count           数量
     */
    @Override
    @GlobalTransactional
    @Transactional(rollbackFor = Exception.class)
    public void createOrder(String commodityCode, Integer count) {
        //商品金额
        BigDecimal commodityMoney = new BigDecimal(10);
        //订单金额
        BigDecimal orderMoney = new BigDecimal(count).multiply(commodityMoney);
        OrderEntity order = new OrderEntity()
                .setCommodityCode(commodityCode)
                .setCount(count)
                .setMoney(orderMoney);

        //减库存
        Result result = storageFeignClient.deduct(commodityCode, count);
        if(!result.success()){
            throw new RenException(result.getMsg());
        }

        //模拟异常
        int i = 1/0;

        //保存订单
        baseDao.insert(order);
    }

    @Override
    public QueryWrapper<OrderEntity> getWrapper(Map<String, Object> params){
        return null;
    }

}