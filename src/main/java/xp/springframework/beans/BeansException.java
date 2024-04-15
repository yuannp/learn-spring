package xp.springframework.beans;

/**
 * @author xp
 * @version 1.0
 * @since 2024/4/11 15:41
 */
public class BeansException extends RuntimeException {

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }

}
