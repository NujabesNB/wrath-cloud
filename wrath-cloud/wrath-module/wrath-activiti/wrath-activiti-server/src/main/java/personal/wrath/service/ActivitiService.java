

package personal.wrath.service;

import personal.wrath.commons.mybatis.service.BaseService;
import personal.wrath.commons.tools.page.PageData;
import personal.wrath.dto.HistoryDetailDTO;
import personal.wrath.dto.ProcessActivityDTO;
import personal.wrath.entity.ProcessActivityEntity;

import java.util.List;
import java.util.Map;

/**
 * 流程自定义查询
 *
 * @author Jone
 */
public interface ActivitiService  extends BaseService<ProcessActivityEntity> {

    PageData<ProcessActivityDTO> getMyProcessInstancePage(Map<String, Object> params);

    List<HistoryDetailDTO> getTaskHandleDetailInfo(String processInstanceId);
}
