

package personal.wrath.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import personal.wrath.commons.mybatis.service.impl.BaseServiceImpl;
import personal.wrath.commons.tools.page.PageData;
import personal.wrath.commons.security.user.SecurityUser;
import personal.wrath.commons.tools.utils.ConvertUtils;
import personal.wrath.dao.ProcessActivityDao;
import personal.wrath.dto.HistoryDetailDTO;
import personal.wrath.dto.ProcessActivityDTO;
import personal.wrath.entity.HistoryDetailEntity;
import personal.wrath.entity.ProcessActivityEntity;
import personal.wrath.service.ActivitiService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 工作流
 *
 * @author Jone
 */
@Service
public class ActivitiServiceImpl extends BaseServiceImpl<ProcessActivityDao, ProcessActivityEntity> implements ActivitiService {

    @Override
    public PageData<ProcessActivityDTO> getMyProcessInstancePage(Map<String, Object> params) {
        params.put("userId", SecurityUser.getUserId().toString());
        IPage<ProcessActivityEntity> page = getPage(params, null, false);
        List<ProcessActivityEntity> list = baseDao.getMyProcessInstancePage(params);
        return getPageData(list, page.getTotal(), ProcessActivityDTO.class);
    }

    @Override
    public List<HistoryDetailDTO> getTaskHandleDetailInfo(String processInstanceId) {
        List<HistoryDetailEntity> listEntity = baseDao.getTaskHandleDetailInfo(processInstanceId);
        for(HistoryDetailEntity entity : listEntity){
            if(entity.getEndTime() != null && entity.getStartTime() != null){
                long diff = entity.getEndTime().getTime() - entity.getStartTime().getTime();
                entity.setDurationInSeconds(diff/1000);
            }
        }
        return ConvertUtils.sourceToTarget(listEntity, HistoryDetailDTO.class);
    }
}
