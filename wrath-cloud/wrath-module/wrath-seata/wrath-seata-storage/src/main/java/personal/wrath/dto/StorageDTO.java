
package personal.wrath.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
* 库存
*
* @author Mark sunlightcs@gmail.com
*/
@Data
@ApiModel(value = "库存")
public class StorageDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    private Long id;
    @ApiModelProperty(value = "商品编码")
    private String commodityCode;
    @ApiModelProperty(value = "商品库存数")
    private Integer total;

}