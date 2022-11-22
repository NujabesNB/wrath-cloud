package personal.wrath.service.impl;

import personal.wrath.commons.mybatis.service.impl.BaseServiceImpl;
import personal.wrath.commons.tools.utils.ConvertUtils;
import personal.wrath.dao.ProcessBizRouteDao;
import personal.wrath.dto.ProcessBizRouteDTO;
import personal.wrath.entity.ProcessBizRouteEntity;
import personal.wrath.service.ProcessBizRouteService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:Jone
 */
@Service
public class ProcessBizRouteServiceImpl  extends BaseServiceImpl<ProcessBizRouteDao, ProcessBizRouteEntity> implements ProcessBizRouteService {

    @Override
    public ProcessBizRouteDTO getProcDefBizRoute(String id) {
        ProcessBizRouteEntity entity = baseDao.getProcDefBizRoute(id);
        ProcessBizRouteDTO dto = ConvertUtils.sourceToTarget(entity, ProcessBizRouteDTO.class);
        return dto;
    }

    @Override
    public void save(ProcessBizRouteDTO processBizRouteDTO) {
        ProcessBizRouteEntity entity = ConvertUtils.sourceToTarget(processBizRouteDTO, ProcessBizRouteEntity.class);
        this.insert(entity);
    }

    @Override
    public void updateProcBizRoute(ProcessBizRouteDTO processBizRouteDTO) {
        ProcessBizRouteEntity entity = ConvertUtils.sourceToTarget(processBizRouteDTO, ProcessBizRouteEntity.class);
        this.updateById(entity);
    }

    @Override
    public ProcessBizRouteDTO getLatestProcDefBizRoute(String procDefKey) {
        List<ProcessBizRouteEntity> list = baseDao.getLatestProcDefBizRoute(procDefKey);
        if(list.isEmpty()){
            return null;
        }
        ProcessBizRouteEntity entity = list.get(0);
        return ConvertUtils.sourceToTarget(entity, ProcessBizRouteDTO.class);
    }
}
