

package personal.wrath.dao;

import personal.wrath.commons.mybatis.dao.BaseDao;
import personal.wrath.entity.HistoryDetailEntity;
import personal.wrath.entity.ProcessActivityEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Primary;

import java.util.List;
import java.util.Map;

/**
 * @author Jone
 */
@Mapper
@Primary
public interface ProcessActivityDao extends BaseDao<ProcessActivityEntity> {

    List<ProcessActivityEntity> getMyProcessInstancePage(Map<String, Object> params);

    List<HistoryDetailEntity> getTaskHandleDetailInfo(String processInstanceId);
}
