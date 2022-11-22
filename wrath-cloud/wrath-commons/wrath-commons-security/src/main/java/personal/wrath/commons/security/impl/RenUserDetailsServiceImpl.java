
package personal.wrath.commons.security.impl;

import personal.wrath.commons.security.enums.UserStatusEnum;
import personal.wrath.commons.security.feign.AccountFeignClient;
import personal.wrath.commons.security.user.UserDetail;
import personal.wrath.commons.tools.exception.ErrorCode;
import personal.wrath.commons.tools.exception.RenException;
import personal.wrath.commons.tools.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * UserDetailsService
 *
 * @author Mark sunlightcs@gmail.com
 */
@Service
public class RenUserDetailsServiceImpl implements UserDetailsService {
    @Autowired(required=false)
    private AccountFeignClient accountFeignClient;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Result<UserDetail> result = accountFeignClient.getByUsername(username);
        UserDetail userDetail = result.getData();
        if(userDetail == null){
            throw new RenException(ErrorCode.ACCOUNT_NOT_EXIST);
        }

        //账号不可用
        if(userDetail.getStatus() == UserStatusEnum.DISABLE.value()){
            userDetail.setEnabled(false);
        }

        return userDetail;
    }
}
