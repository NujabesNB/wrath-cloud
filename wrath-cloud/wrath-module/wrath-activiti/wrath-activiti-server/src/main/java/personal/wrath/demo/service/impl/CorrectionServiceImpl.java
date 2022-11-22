package personal.wrath.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import personal.wrath.commons.mybatis.service.impl.CrudServiceImpl;
import personal.wrath.demo.dao.CorrectionDao;
import personal.wrath.demo.dto.CorrectionDTO;
import personal.wrath.demo.entity.CorrectionEntity;
import personal.wrath.demo.service.CorrectionService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 转正申请
 *
 * @author Mark sunlightcs@gmail.com
 */
@Service
public class CorrectionServiceImpl extends CrudServiceImpl<CorrectionDao, CorrectionEntity, CorrectionDTO> implements CorrectionService {

    @Override
    public QueryWrapper<CorrectionEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<CorrectionEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }

    @Override
    public void updateInstanceId(String instanceId, Long id) {
        baseDao.updateInstanceId(instanceId, id);
    }
}