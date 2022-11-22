

package personal.wrath.commons.security.context;

import personal.wrath.commons.security.user.UserDetail;
import personal.wrath.commons.tools.enums.SuperAdminEnum;
import personal.wrath.commons.tools.utils.HttpContextUtils;
import org.apache.commons.lang3.StringUtils;

/**
 * 租户
 *
 * @author Mark sunlightcs@gmail.com
 */
public class TenantContext {

    public static Long getTenantCode(UserDetail user){
        if(user.getTenantCode() == null){
            return null;
        }

        String tenantCode = HttpContextUtils.getTenantCode();
        //超级管理员，才可以切换租户
        if(user.getSuperAdmin() == SuperAdminEnum.YES.value()){
            if(StringUtils.isNotBlank(tenantCode)){
                return Long.parseLong(tenantCode);
            }
        }
        return user.getTenantCode();
    }
}
