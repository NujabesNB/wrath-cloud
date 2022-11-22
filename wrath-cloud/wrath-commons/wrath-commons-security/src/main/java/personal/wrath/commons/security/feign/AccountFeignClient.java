

package personal.wrath.commons.security.feign;

import personal.wrath.commons.security.feign.fallback.AccountFeignClientFallbackFactory;
import personal.wrath.commons.security.user.UserDetail;
import personal.wrath.commons.tools.constant.ServiceConstant;
import personal.wrath.commons.tools.utils.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 账号接口
 *
 * @author Mark sunlightcs@gmail.com
 */
@FeignClient(name = ServiceConstant.WRATH_ADMIN_SERVER, contextId = "AccountFeignClient", fallbackFactory = AccountFeignClientFallbackFactory.class)
public interface AccountFeignClient {

    /**
     * 根据用户名，获取用户信息
     * @param username  用户名
     */
    @PostMapping("sys/user/getByUsername")
    Result<UserDetail> getByUsername(@RequestParam("username") String username);

}