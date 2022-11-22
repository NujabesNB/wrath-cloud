

package personal.wrath.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import personal.wrath.commons.mybatis.service.impl.CrudServiceImpl;
import personal.wrath.dao.UReportDataDao;
import personal.wrath.dto.UReportDataDTO;
import personal.wrath.entity.UReportDataEntity;
import personal.wrath.service.UReportDataService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service
public class UReportDataServiceImpl extends CrudServiceImpl<UReportDataDao, UReportDataEntity, UReportDataDTO> implements UReportDataService {

    @Override
    public QueryWrapper<UReportDataEntity> getWrapper(Map<String, Object> params){
        String fileName = (String)params.get("fileName");

        QueryWrapper<UReportDataEntity> wrapper = new QueryWrapper<>();
        wrapper.like(StringUtils.isNotBlank(fileName), "file_name", fileName);
        return wrapper;
    }

}
