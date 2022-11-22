

package personal.wrath.feign;

import feign.codec.Encoder;
import feign.form.spring.SpringFormEncoder;
import personal.wrath.commons.tools.utils.Result;
import personal.wrath.dto.UploadDTO;
import personal.wrath.feign.fallback.OssFeignClientFallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

/**
 * OSS
 *
 * @author Mark sunlightcs@gmail.c om
 * @since 1.1.0
 */
@FeignClient(name = "wrath-oss-server", fallbackFactory = OssFeignClientFallbackFactory.class,
        configuration = OssFeignClient.MultipartSupportConfig.class)
public interface OssFeignClient {
    /**
     * 文件上传
     * @param file 文件
     * @return  返回路径
     */
    @PostMapping(value = "oss/file/upload", produces = {MediaType.APPLICATION_JSON_VALUE},
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    Result<UploadDTO> upload(@RequestPart("file") MultipartFile file);

    class MultipartSupportConfig {
        @Bean
        public Encoder feignFormEncoder() {
            return new SpringFormEncoder();
        }
    }

}
