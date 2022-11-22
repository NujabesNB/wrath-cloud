
package personal.wrath.exception;

import org.springframework.security.core.AuthenticationException;

/**
 * 认证异常类
 *
 * @author Mark sunlightcs@gmail.com
 */
public class RenAuthenticationException extends AuthenticationException {
    public RenAuthenticationException(String msg, Throwable t) {
        super(msg, t);
    }

    public RenAuthenticationException(String msg) {
        super(msg);
    }
}
