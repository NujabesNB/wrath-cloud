
package personal.wrath.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

/**
 * 订单
 *
 * @author Mark sunlightcs@gmail.com
 */
@Data
@Accessors(chain = true)
@TableName("seata_order")
public class OrderEntity {
	private static final long serialVersionUID = 1L;

	/**
	* id
	*/
	private Long id;
	/**
	* 商品编码
	*/
	private String commodityCode;
	/**
	* 数量
	*/
	private Integer count;
	/**
	* 金额
	*/
	private BigDecimal money;
}