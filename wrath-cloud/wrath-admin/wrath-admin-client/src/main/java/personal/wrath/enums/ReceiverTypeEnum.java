

package personal.wrath.enums;

/**
 * 接受者类型枚举
 *
 * @author Mark sunlightcs@gmail.com
 */
public enum ReceiverTypeEnum {
    /**
     * 全部
     */
    ALL(0),
    /**
     * 部门
     */
    DEPT(1);

    private int value;

    ReceiverTypeEnum(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }
}
