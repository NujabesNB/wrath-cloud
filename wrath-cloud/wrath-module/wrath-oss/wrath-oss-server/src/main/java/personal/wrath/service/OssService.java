

package personal.wrath.service;

import personal.wrath.commons.mybatis.service.BaseService;
import personal.wrath.commons.tools.page.PageData;
import personal.wrath.entity.OssEntity;

import java.util.Map;

/**
 * 文件上传
 * 
 * @author Mark sunlightcs@gmail.com
 */
public interface OssService extends BaseService<OssEntity> {

	PageData<OssEntity> page(Map<String, Object> params);
}
