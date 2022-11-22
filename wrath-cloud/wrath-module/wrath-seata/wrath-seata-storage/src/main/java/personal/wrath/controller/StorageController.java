
package personal.wrath.controller;

import personal.wrath.commons.tools.utils.Result;
import personal.wrath.service.StorageService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
* 库存表
*
* @author Mark sunlightcs@gmail.com
*/
@RestController
@RequestMapping("storage")
@Api(tags="库存表")
public class StorageController {
    @Autowired
    private StorageService storageService;

    /**
     * 减库存
     * @param commodityCode 商品编码
     * @param count 数量
     */
    @RequestMapping(path = "deduct")
    public Result deduct(String commodityCode, Integer count) {
        storageService.deduct(commodityCode, count);

        return new Result();
    }

}