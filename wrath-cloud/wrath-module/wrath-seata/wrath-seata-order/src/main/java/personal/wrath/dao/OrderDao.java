
package personal.wrath.dao;

import personal.wrath.commons.mybatis.dao.BaseDao;
import personal.wrath.entity.OrderEntity;
import org.apache.ibatis.annotations.Mapper;

/**
* 订单
*
* @author Mark sunlightcs@gmail.com
*/
@Mapper
public interface OrderDao extends BaseDao<OrderEntity> {
	
}