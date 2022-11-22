
package personal.wrath.listener;

import personal.wrath.commons.log.SysLogLogin;
import personal.wrath.commons.log.enums.LogTypeEnum;
import personal.wrath.commons.log.enums.LoginOperationEnum;
import personal.wrath.commons.log.producer.LogProducer;
import personal.wrath.commons.tools.utils.HttpContextUtils;
import personal.wrath.commons.tools.utils.IpUtils;
import lombok.AllArgsConstructor;
import org.apache.http.HttpHeaders;
import org.springframework.context.ApplicationListener;
import org.springframework.security.authentication.event.AuthenticationSuccessEvent;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * 用户登录的监听事件
 *
 * @author Mark sunlightcs@gmail.com
 */
@Component
@AllArgsConstructor
public class AuthenticationSuccessEventListener implements ApplicationListener<AuthenticationSuccessEvent> {
    private LogProducer logProducer;

    @Override
    public void onApplicationEvent(AuthenticationSuccessEvent event) {
        HttpServletRequest request = HttpContextUtils.getHttpServletRequest();

        //登录日志
        SysLogLogin log = new SysLogLogin();
        log.setType(LogTypeEnum.LOGIN.value());
        log.setOperation(LoginOperationEnum.LOGIN.value());
        log.setIp(IpUtils.getIpAddr(request));
        log.setUserAgent(request.getHeader(HttpHeaders.USER_AGENT));
        log.setIp(IpUtils.getIpAddr(request));
        log.setCreatorName(request.getParameter("username"));
        log.setCreateDate(new Date());
        logProducer.saveLog(log);
    }
}