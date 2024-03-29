

package personal.wrath.enums;

/**
 * 平台枚举
 *
 * @author Mark sunlightcs@gmail.com
 */
public enum PlatformEnum {
    /**
     * 阿里云
     */
    ALIYUN(1),
    /**
     * 腾讯云
     */
    QCLOUD(2),
    /**
     * 七牛云
     */
    QINIU(3);

    private int value;

    PlatformEnum(int value) {
        this.value = value;
    }

    public int value() {
        return value;
    }
}