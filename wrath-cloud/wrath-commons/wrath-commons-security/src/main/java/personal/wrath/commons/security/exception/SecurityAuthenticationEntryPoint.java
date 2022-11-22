

package personal.wrath.commons.security.exception;

import com.alibaba.fastjson.JSON;
import personal.wrath.commons.tools.exception.ErrorCode;
import personal.wrath.commons.tools.utils.Result;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 匿名用户(token不存在、错误)，异常处理器
 *
 * @author Mark sunlightcs@gmail.com
 */
public class SecurityAuthenticationEntryPoint implements AuthenticationEntryPoint {

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
        response.setContentType("application/json;charset=UTF-8");
        response.getWriter().print(JSON.toJSONString(new Result<>().error(ErrorCode.UNAUTHORIZED)));
    }
}