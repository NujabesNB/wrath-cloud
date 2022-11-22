

package personal.wrath.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import personal.wrath.commons.mybatis.service.impl.BaseServiceImpl;
import personal.wrath.commons.tools.constant.Constant;
import personal.wrath.commons.tools.page.PageData;
import personal.wrath.dao.DataSourceDao;
import personal.wrath.entity.DataSourceEntity;
import personal.wrath.service.DataSourceService;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


/**
 * 数据源管理
 *
 * @author Mark sunlightcs@gmail.com
 */
@Service
public class DataSourceServiceImpl extends BaseServiceImpl<DataSourceDao, DataSourceEntity> implements DataSourceService {

    @Override
    public PageData<DataSourceEntity> page(Map<String, Object> params) {
        IPage<DataSourceEntity> page = baseDao.selectPage(
            getPage(params, Constant.CREATE_DATE, false),
            getWrapper(params)
        );
        return new PageData<>(page.getRecords(), page.getTotal());
    }

    private QueryWrapper<DataSourceEntity> getWrapper(Map<String, Object> params){
        String connName = (String)params.get("connName");
        String dbType = (String)params.get("dbType");

        QueryWrapper<DataSourceEntity> wrapper = new QueryWrapper<>();
        wrapper.like(StringUtils.isNotEmpty(connName), "conn_name", connName);
        wrapper.eq(StringUtils.isNotEmpty(dbType), "db_type", dbType);
        return wrapper;
    }

    @Override
    public List<DataSourceEntity> list() {
        QueryWrapper wrapper = new QueryWrapper<>();
        wrapper.eq("status", 0);

        return baseDao.selectList(wrapper);
    }

}