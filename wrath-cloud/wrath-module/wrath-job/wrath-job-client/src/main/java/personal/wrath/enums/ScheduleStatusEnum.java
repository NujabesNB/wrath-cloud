

package personal.wrath.enums;

/**
 * 定时任务状态
 *
 * @author Mark sunlightcs@gmail.com
 * @since 1.1.0
 */
public enum ScheduleStatusEnum {
    /**
     * 暂停
     */
    PAUSE(0),
    /**
     * 正常
     */
    NORMAL(1);

    private int value;

    ScheduleStatusEnum(int value) {
        this.value = value;
    }

    public int value() {
        return value;
    }
}
