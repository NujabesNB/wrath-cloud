
package personal.wrath.controller;

import personal.wrath.commons.tools.utils.Result;
import personal.wrath.service.OrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
* 订单
*
* @author Mark sunlightcs@gmail.com
*/
@RestController
@RequestMapping("order")
@Api(tags="订单")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("create")
    @ApiOperation("创建订单")
    public Result createOrder(String commodityCode, Integer count){
        //创建订单、减库存，涉及到两个服务
        orderService.createOrder(commodityCode, count);

        return new Result();
    }


}