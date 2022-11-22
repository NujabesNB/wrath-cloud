

package personal.wrath.controller;

import personal.wrath.commons.log.annotation.LogOperation;
import personal.wrath.commons.tools.constant.Constant;
import personal.wrath.commons.tools.page.PageData;
import personal.wrath.commons.tools.utils.Result;
import personal.wrath.dto.ProcessInstanceDTO;
import personal.wrath.dto.ProcessStartDTO;
import personal.wrath.service.ActRunningService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.Map;

/**
 * 运行中的流程
 *
 * @author Mark sunlightcs@gmail.com
 */
@RestController
@RequestMapping("running")
@Api(tags="运行中的流程")
public class ActRunningController {
    @Autowired
    private ActRunningService actRunningService;

    @GetMapping("page")
    @ApiOperation("分页")
    @ApiImplicitParams({
        @ApiImplicitParam(name = Constant.PAGE, value = "当前页码，从1开始", paramType = "query", required = true, dataType="int") ,
        @ApiImplicitParam(name = Constant.LIMIT, value = "每页显示记录数", paramType = "query",required = true, dataType="int") ,
        @ApiImplicitParam(name = "id", value = "实例ID", paramType = "query", dataType="String"),
        @ApiImplicitParam(name = "definitionKey", value = "definitionKey", paramType = "query", dataType="String")
    })
    @PreAuthorize("hasAuthority('sys:running:all')")
    public Result<PageData<Map<String, Object>>> page(@ApiIgnore @RequestParam Map<String, Object> params){
        PageData<Map<String, Object>> page = actRunningService.page(params);

        return new Result<PageData<Map<String, Object>>>().ok(page);
    }

    @DeleteMapping("{id}")
    @ApiOperation("删除")
    @LogOperation("删除")
    @PreAuthorize("hasAuthority('sys:running:all')")
    @ApiImplicitParam(name = "id", value = "ID", paramType = "query", dataType="String")
    public Result deleteInstance(@PathVariable("id") String id) {
        actRunningService.delete(id);
        return new Result();
    }

    @PostMapping("start")
    @ApiOperation("启动流程实例，依据流程定义KEY，启动流程实例")
    @LogOperation("启动流程实例，依据流程定义KEY，启动流程实例")
    @PreAuthorize("hasAuthority('sys:running:all')")
    @ApiImplicitParam(name = "key", value = "流程定义标识key", paramType = "query", dataType="String")
    public Result<ProcessInstanceDTO> start(String key){
        ProcessInstanceDTO dto = actRunningService.startProcess(key);
        return new Result().ok(dto);
    }

    @PostMapping("startOfBusinessKey")
    @ApiOperation("启动流程实例，依据流程定义ID和业务唯一标示启动实例")
    @LogOperation("启动流程实例，依据流程定义ID和业务唯一标示启动实例")
    @PreAuthorize("hasAuthority('sys:running:all')")
    public Result<ProcessInstanceDTO> startOfBusinessKey(@RequestBody ProcessStartDTO processStartDTO){
        ProcessInstanceDTO dto = actRunningService.startOfBusinessKey(processStartDTO);
        return new Result().ok(dto);
    }

}