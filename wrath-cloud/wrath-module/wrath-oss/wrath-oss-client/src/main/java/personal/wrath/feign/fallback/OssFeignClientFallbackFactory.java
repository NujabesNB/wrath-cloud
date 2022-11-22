

package personal.wrath.feign.fallback;

import feign.hystrix.FallbackFactory;
import personal.wrath.commons.tools.utils.Result;
import personal.wrath.dto.UploadDTO;
import personal.wrath.feign.OssFeignClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * OSS FallbackFactory
 *
 * @author Mark sunlightcs@gmail.com
 */
@Slf4j
@Component
public class OssFeignClientFallbackFactory implements FallbackFactory<OssFeignClient> {
    @Override
    public OssFeignClient create(Throwable throwable) {
        log.error("{}", throwable);

        return file -> new Result<UploadDTO>().error();
    }
}
