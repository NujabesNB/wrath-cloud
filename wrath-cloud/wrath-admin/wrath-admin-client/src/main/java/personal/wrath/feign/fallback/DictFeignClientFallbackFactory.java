

package personal.wrath.feign.fallback;

import feign.hystrix.FallbackFactory;
import personal.wrath.commons.tools.utils.Result;
import personal.wrath.feign.DictFeignClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 字典接口 FallbackFactory
 *
 * @author Mark sunlightcs@gmail.com
 */
@Slf4j
@Component
public class DictFeignClientFallbackFactory implements FallbackFactory<DictFeignClient> {
    @Override
    public DictFeignClient create(Throwable throwable) {
        log.error("{}", throwable);
        return () -> new Result<>();
    }
}
