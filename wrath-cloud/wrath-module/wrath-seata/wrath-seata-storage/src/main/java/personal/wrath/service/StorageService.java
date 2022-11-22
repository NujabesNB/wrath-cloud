
package personal.wrath.service;

import personal.wrath.commons.mybatis.service.CrudService;
import personal.wrath.dto.StorageDTO;
import personal.wrath.entity.StorageEntity;

/**
 * 库存表
 *
 * @author Mark sunlightcs@gmail.com
 */
public interface StorageService extends CrudService<StorageEntity, StorageDTO> {

    /**
     * 减库存
     *
     * @param commodityCode 商品代码
     * @param count         数量
     */
    void deduct(String commodityCode, int count);

}