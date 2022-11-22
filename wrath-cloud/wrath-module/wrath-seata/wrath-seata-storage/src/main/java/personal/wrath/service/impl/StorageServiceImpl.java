
package personal.wrath.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import personal.wrath.commons.mybatis.service.impl.CrudServiceImpl;
import personal.wrath.commons.tools.exception.RenException;
import personal.wrath.dao.StorageDao;
import personal.wrath.dto.StorageDTO;
import personal.wrath.entity.StorageEntity;
import personal.wrath.service.StorageService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

/**
 * 库存表
 *
 * @author Mark sunlightcs@gmail.com
 */
@Service
public class StorageServiceImpl extends CrudServiceImpl<StorageDao, StorageEntity, StorageDTO> implements StorageService {

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deduct(String commodityCode, int count) {
        int updateCount = baseDao.updateDeduct(commodityCode, count);
        if (updateCount == 0) {
            throw new RenException("库存数不足，请稍后再试！");
        }
    }

    @Override
    public QueryWrapper<StorageEntity> getWrapper(Map<String, Object> params){
        return null;
    }

}