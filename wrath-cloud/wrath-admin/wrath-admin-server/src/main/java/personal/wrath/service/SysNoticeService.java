
package personal.wrath.service;

import personal.wrath.commons.mybatis.service.CrudService;
import personal.wrath.commons.tools.page.PageData;
import personal.wrath.dto.SysNoticeDTO;
import personal.wrath.entity.SysNoticeEntity;

import java.util.Map;

/**
 * 通知管理
 *
 * @author Mark sunlightcs@gmail.com
 */
public interface SysNoticeService extends CrudService<SysNoticeEntity, SysNoticeDTO> {

    /**
     * 获取被通知的用户
     */
    PageData<SysNoticeDTO> getNoticeUserPage(Map<String, Object> params);

    /**
     * 获取我的通知列表
     */
    PageData<SysNoticeDTO> getMyNoticePage(Map<String, Object> params);
}