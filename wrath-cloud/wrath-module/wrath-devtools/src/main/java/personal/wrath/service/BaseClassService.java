

package personal.wrath.service;


import personal.wrath.commons.mybatis.service.BaseService;
import personal.wrath.commons.tools.page.PageData;
import personal.wrath.entity.BaseClassEntity;

import java.util.List;
import java.util.Map;

/**
 * 基类管理
 *
 * @author Mark sunlightcs@gmail.com
 */
public interface BaseClassService extends BaseService<BaseClassEntity> {

    PageData<BaseClassEntity> page(Map<String, Object> params);

    List<BaseClassEntity> list();
}