package personal.wrath.service;

import personal.wrath.commons.mybatis.service.CrudService;
import personal.wrath.dto.ProductDTO;
import personal.wrath.entity.ProductEntity;

/**
 * 产品管理
 *
 * @author Mark sunlightcs@gmail.com
 */
public interface ProductService extends CrudService<ProductEntity, ProductDTO> {

}