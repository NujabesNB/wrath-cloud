package personal.wrath.swagger;

import lombok.Data;

/**
 * Swagger资源信息
 *
 * @author Mark sunlightcs@gmail.com
 */
@Data
public class SwaggerRouteProperties {
    /**
     * 文档名称
     */
    private String name;
    /**
     * 文档地址
     */
    private String location;

}
