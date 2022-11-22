

package personal.wrath.feign;

import personal.wrath.commons.tools.utils.Result;
import personal.wrath.feign.fallback.StorageFeignClientFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 库存 Feign Client
 *
 * @author Mark sunlightcs@gmail.com
 */
@FeignClient(name = "wrath-seata-storage", fallbackFactory = StorageFeignClientFallbackFactory.class)
public interface StorageFeignClient {

	/**
	 * 减库存
	 *
	 * @param commodityCode 商品代码
	 * @param count         数量
	 */
	@PutMapping("seata-storage/storage/deduct")
	Result deduct(@RequestParam("commodityCode") String commodityCode, @RequestParam("count") Integer count);

}
