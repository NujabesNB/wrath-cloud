package personal.wrath.service;

import personal.wrath.commons.mybatis.service.BaseService;
import personal.wrath.dto.ProcessBizRouteDTO;
import personal.wrath.entity.ProcessBizRouteEntity;

/**
 * @Author:Jone
 */
public interface ProcessBizRouteService  extends BaseService<ProcessBizRouteEntity> {

    ProcessBizRouteDTO getProcDefBizRoute(String id);

    void save(ProcessBizRouteDTO processBizRouteDTO);

    void updateProcBizRoute(ProcessBizRouteDTO processBizRouteDTO);

    ProcessBizRouteDTO getLatestProcDefBizRoute(String procDefKey);
}
