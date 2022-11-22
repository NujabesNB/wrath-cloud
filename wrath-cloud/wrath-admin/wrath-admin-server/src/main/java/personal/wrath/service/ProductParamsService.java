package personal.wrath.service;


import personal.wrath.commons.mybatis.service.BaseService;
import personal.wrath.dto.ProductParamsDTO;
import personal.wrath.entity.ProductParamsEntity;

import java.util.List;

/**
 * 产品参数管理
 *
 * @author Mark sunlightcs@gmail.com
 */
public interface ProductParamsService extends BaseService<ProductParamsEntity> {

    void saveOrUpdate(Long productId, List<ProductParamsDTO> list);

    void deleteByProductIds(Long[] productIds);

    List<ProductParamsDTO> getList(Long productId);
}