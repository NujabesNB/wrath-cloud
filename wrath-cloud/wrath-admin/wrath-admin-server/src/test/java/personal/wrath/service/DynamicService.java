

package personal.wrath.service;

import personal.wrath.commons.dynamic.datasource.annotation.DataSource;
import personal.wrath.commons.mybatis.service.impl.BaseServiceImpl;
import personal.wrath.dao.SysUserDao;
import personal.wrath.entity.SysUserEntity;

/**
 * 测试多数据源
 *
 * @author Mark sunlightcs@gmail.com
 * @since 1.1.0
 */
@DataSource("slave2")
public class DynamicService extends BaseServiceImpl<SysUserDao, SysUserEntity> {
}
