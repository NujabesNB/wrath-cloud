package personal.wrath.dao;

import personal.wrath.commons.mybatis.dao.BaseDao;
import personal.wrath.entity.ProcessBizRouteEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author:Jone
 */
@Mapper
public interface ProcessBizRouteDao extends BaseDao<ProcessBizRouteEntity> {
    ProcessBizRouteEntity getProcDefBizRoute(@Param("proDefId") String id);

    List<ProcessBizRouteEntity> getLatestProcDefBizRoute(@Param("procDefKey") String procDefKey);
}
