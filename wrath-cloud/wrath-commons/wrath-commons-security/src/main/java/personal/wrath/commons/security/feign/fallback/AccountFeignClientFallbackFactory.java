

package personal.wrath.commons.security.feign.fallback;

import feign.hystrix.FallbackFactory;
import personal.wrath.commons.security.feign.AccountFeignClient;
import personal.wrath.commons.tools.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 账号接口 FallbackFactory
 *
 * @author Mark sunlightcs@gmail.com
 */
@Slf4j
@Component
public class AccountFeignClientFallbackFactory implements FallbackFactory<AccountFeignClient> {
    @Override
    public AccountFeignClient create(Throwable throwable) {
        log.error("{}", throwable);

        return username -> new Result<>();
    }
}
