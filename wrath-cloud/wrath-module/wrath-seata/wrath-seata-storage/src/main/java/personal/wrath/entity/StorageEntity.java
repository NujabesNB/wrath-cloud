
package personal.wrath.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 库存表
 *
 * @author Mark sunlightcs@gmail.com
 */
@Data
@TableName("seata_storage")
public class StorageEntity {
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
	* 商品库存数
	*/
	private Integer total;
}