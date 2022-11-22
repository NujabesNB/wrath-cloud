

package personal.wrath.service;


import personal.wrath.commons.mybatis.service.BaseService;
import personal.wrath.commons.tools.page.PageData;
import personal.wrath.entity.TemplateEntity;

import java.util.List;
import java.util.Map;

/**
 * 模板管理
 *
 * @author Mark sunlightcs@gmail.com
 */
public interface TemplateService extends BaseService<TemplateEntity> {

    PageData<TemplateEntity> page(Map<String, Object> params);

    List<TemplateEntity> list();

    void updateStatusBatch(Long[] ids, int status);

}