package ${package}<#if moduleName??>.${moduleName}</#if>.controller<#if subModuleName??>.${subModuleName}</#if>;

import ${package}.commons.log.annotation.LogOperation;
import ${package}.commons.tools.constant.Constant;
import ${package}.commons.tools.page.PageData;
import ${package}.commons.tools.utils.Result;
import ${package}.commons.tools.utils.ExcelUtils;
import ${package}.commons.tools.validator.AssertUtils;
import ${package}.commons.tools.validator.ValidatorUtils;
import ${package}.commons.tools.validator.group.AddGroup;
import ${package}.commons.tools.validator.group.DefaultGroup;
import ${package}.commons.tools.validator.group.UpdateGroup;
import ${package}<#if moduleName??>.${moduleName}</#if>.dto<#if subModuleName??>.${subModuleName}</#if>.${ClassName}DTO;
import ${package}<#if moduleName??>.${moduleName}</#if>.excel<#if subModuleName??>.${subModuleName}</#if>.${ClassName}Excel;
import ${package}<#if moduleName??>.${moduleName}</#if>.service<#if subModuleName??>.${subModuleName}</#if>.${ClassName}Service;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;


/**
* ${tableComment}
*
* @author ${author} ${email}
* @since ${version} ${date}
*/
@RestController
@RequestMapping("${classname}")
@Api(tags="${tableComment}")
public class ${ClassName}Controller {
    @Autowired
    private ${ClassName}Service ${className}Service;

    @GetMapping("page")
    @ApiOperation("分页")
    @ApiImplicitParams({
        @ApiImplicitParam(name = Constant.PAGE, value = "当前页码，从1开始", paramType = "query", required = true, dataType="int") ,
        @ApiImplicitParam(name = Constant.LIMIT, value = "每页显示记录数", paramType = "query",required = true, dataType="int") ,
        @ApiImplicitParam(name = Constant.ORDER_FIELD, value = "排序字段", paramType = "query", dataType="String") ,
        @ApiImplicitParam(name = Constant.ORDER, value = "排序方式，可选值(asc、desc)", paramType = "query", dataType="String")
    })
    @PreAuthorize("hasAuthority('${backendUrl}:${classname}:page')")
    public Result<PageData<${ClassName}DTO>> page(@ApiIgnore @RequestParam Map<String, Object> params){
        PageData<${ClassName}DTO> page = ${className}Service.page(params);

        return new Result<PageData<${ClassName}DTO>>().ok(page);
    }

    @GetMapping("{id}")
    @ApiOperation("信息")
    @PreAuthorize("hasAuthority('${backendUrl}:${classname}:info')")
    public Result<${ClassName}DTO> get(@PathVariable("id") Long id){
        ${ClassName}DTO data = ${className}Service.get(id);

        return new Result<${ClassName}DTO>().ok(data);
    }

    @PostMapping
    @ApiOperation("保存")
    @LogOperation("保存")
    @PreAuthorize("hasAuthority('${backendUrl}:${classname}:save')")
    public Result save(@RequestBody ${ClassName}DTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, AddGroup.class, DefaultGroup.class);

        ${className}Service.save(dto);

        return new Result();
    }

    @PutMapping
    @ApiOperation("修改")
    @LogOperation("修改")
    @PreAuthorize("hasAuthority('${backendUrl}:${classname}:update')")
    public Result update(@RequestBody ${ClassName}DTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, UpdateGroup.class, DefaultGroup.class);

        ${className}Service.update(dto);

        return new Result();
    }

    @DeleteMapping
    @ApiOperation("删除")
    @LogOperation("删除")
    @PreAuthorize("hasAuthority('${backendUrl}:${classname}:delete')")
    public Result delete(@RequestBody Long[] ids){
        //效验数据
        AssertUtils.isArrayEmpty(ids, "id");

        ${className}Service.delete(ids);

        return new Result();
    }

    @GetMapping("export")
    @ApiOperation("导出")
    @LogOperation("导出")
    @PreAuthorize("hasAuthority('${backendUrl}:${classname}:export')")
    public void export(@ApiIgnore @RequestParam Map<String, Object> params, HttpServletResponse response) throws Exception {
        List<${ClassName}DTO> list = ${className}Service.list(params);

        ExcelUtils.exportExcelToTarget(response, null, "${tableComment}", list, ${ClassName}Excel.class);
    }

}