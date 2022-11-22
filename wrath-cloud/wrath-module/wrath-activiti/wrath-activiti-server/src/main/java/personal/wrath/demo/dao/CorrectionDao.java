package personal.wrath.demo.dao;

import personal.wrath.commons.mybatis.dao.BaseDao;
import personal.wrath.demo.entity.CorrectionEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 转正申请
 *
 * @author Mark sunlightcs@gmail.com
 */
@Mapper
public interface CorrectionDao extends BaseDao<CorrectionEntity> {

    void updateInstanceId(@Param("instanceId") String instanceId, @Param("id") Long id);
}