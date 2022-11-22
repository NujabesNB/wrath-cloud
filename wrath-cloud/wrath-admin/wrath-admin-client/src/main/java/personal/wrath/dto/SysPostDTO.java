
package personal.wrath.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
* 岗位管理
*
* @author Mark sunlightcs@gmail.com
*/
@Data
@ApiModel(value = "岗位管理")
public class SysPostDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    private Long id;
    @ApiModelProperty(value = "岗位编码")
    private String postCode;
    @ApiModelProperty(value = "岗位名称")
    private String postName;
    @ApiModelProperty(value = "排序")
    private Integer sort;
    @ApiModelProperty(value = "状态")
    private Integer status;
    @ApiModelProperty(value = "创建时间")
    private Date createDate;

}