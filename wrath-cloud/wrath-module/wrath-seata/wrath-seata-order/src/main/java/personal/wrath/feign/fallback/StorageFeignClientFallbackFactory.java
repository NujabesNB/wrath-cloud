

package personal.wrath.feign.fallback;

import feign.hystrix.FallbackFactory;
import personal.wrath.commons.tools.utils.Result;
import personal.wrath.feign.StorageFeignClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 库存 Feign Client FallbackFactory
 *
 * @author Mark sunlightcs@gmail.com
 */
@Slf4j
@Component
public class StorageFeignClientFallbackFactory implements FallbackFactory<StorageFeignClient> {
    @Override
    public StorageFeignClient create(Throwable throwable) {
        log.error("{}", throwable);

        return (commodityCode, count) -> new Result().error();
    }
}
