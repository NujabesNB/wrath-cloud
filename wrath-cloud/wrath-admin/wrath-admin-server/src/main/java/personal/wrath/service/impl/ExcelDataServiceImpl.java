package personal.wrath.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import personal.wrath.commons.mybatis.service.impl.CrudServiceImpl;
import personal.wrath.dao.ExcelDataDao;
import personal.wrath.dto.ExcelDataDTO;
import personal.wrath.entity.ExcelDataEntity;
import personal.wrath.service.ExcelDataService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Excel导入演示
 *
 * @author Mark sunlightcs@gmail.com
 */
@Service
public class ExcelDataServiceImpl extends CrudServiceImpl<ExcelDataDao, ExcelDataEntity, ExcelDataDTO> implements ExcelDataService {

    @Override
    public QueryWrapper<ExcelDataEntity> getWrapper(Map<String, Object> params){
        QueryWrapper<ExcelDataEntity> wrapper = new QueryWrapper<>();

        String realName = (String)params.get("realName");
        wrapper.like(StringUtils.isNotBlank(realName), "real_name", realName);

        String identity = (String)params.get("identity");
        wrapper.like(StringUtils.isNotBlank(identity), "identity", identity);

        return wrapper;
    }
}