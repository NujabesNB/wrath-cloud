
package personal.wrath.entity;

import lombok.Data;

/**
 * 创建菜单
 *
 * @author Mark sunlightcs@gmail.com
 */
@Data
public class MenuEntity {
    private Long pid;
    private String name;
    private String icon;
    private String backendUrl;
    private String className;

}
