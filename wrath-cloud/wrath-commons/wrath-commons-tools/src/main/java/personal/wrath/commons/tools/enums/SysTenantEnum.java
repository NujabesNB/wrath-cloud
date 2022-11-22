

package personal.wrath.commons.tools.enums;

/**
 * 系统租户枚举
 *
 * @author Mark sunlightcs@gmail.com
 */
public enum SysTenantEnum {
    YES(1),
    NO(0);

    private int value;

    SysTenantEnum(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }
}