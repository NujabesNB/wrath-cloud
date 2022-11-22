

package personal.wrath.controller;

import personal.wrath.commons.tools.constant.Constant;
import personal.wrath.commons.tools.page.PageData;
import personal.wrath.commons.tools.utils.Result;
import personal.wrath.commons.tools.validator.AssertUtils;
import personal.wrath.commons.tools.validator.ValidatorUtils;
import personal.wrath.commons.tools.validator.group.AddGroup;
import personal.wrath.commons.tools.validator.group.DefaultGroup;
import personal.wrath.commons.tools.validator.group.UpdateGroup;
import personal.wrath.dto.NewsDTO;
import personal.wrath.service.NewsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.Arrays;
import java.util.Map;

/**
 * 新闻
 *
 * @author Mark sunlightcs@gmail.com
 */
@RestController
@RequestMapping("news")
@Api(tags="新闻管理")
public class NewsController {
    @Autowired
    private NewsService newsService;

    @GetMapping("page")
    @ApiOperation("分页")
    @ApiImplicitParams({
        @ApiImplicitParam(name = Constant.PAGE, value = "当前页码，从1开始", paramType = "query", required = true, dataType="int") ,
        @ApiImplicitParam(name = Constant.LIMIT, value = "每页显示记录数", paramType = "query",required = true, dataType="int") ,
        @ApiImplicitParam(name = Constant.ORDER_FIELD, value = "排序字段", paramType = "query", dataType="String") ,
        @ApiImplicitParam(name = Constant.ORDER, value = "排序方式，可选值(asc、desc)", paramType = "query", dataType="String") ,
        @ApiImplicitParam(name = "title", value = "标题", paramType = "query", dataType="String"),
        @ApiImplicitParam(name = "startDate", value = "开始时间", paramType = "query", dataType="String"),
        @ApiImplicitParam(name = "endDate", value = "结束时间", paramType = "query", dataType="String")
    })
    @PreAuthorize("hasAuthority('demo:news:all')")
    public Result<PageData<NewsDTO>> page(@ApiIgnore @RequestParam Map<String, Object> params){
        PageData<NewsDTO> page = newsService.page(params);

        return new Result<PageData<NewsDTO>>().ok(page);
    }

    @ApiOperation("信息")
    @GetMapping("{id}")
    @PreAuthorize("hasAuthority('demo:news:all')")
    public Result<NewsDTO> info(@PathVariable("id") Long id){
        NewsDTO news = newsService.get(id);

        return new Result<NewsDTO>().ok(news);
    }

    @PostMapping
    @ApiOperation("保存")
    @PreAuthorize("hasAuthority('demo:news:all')")
    public Result save(NewsDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, AddGroup.class, DefaultGroup.class);

        newsService.save(dto);

        return new Result();
    }

    @PutMapping
    @ApiOperation("修改")
    @PreAuthorize("hasAuthority('demo:news:all')")
    public Result update(NewsDTO dto){
        //效验数据
        ValidatorUtils.validateEntity(dto, UpdateGroup.class, DefaultGroup.class);

        newsService.update(dto);

        return new Result();
    }

    @DeleteMapping
    @ApiOperation("删除")
    @PreAuthorize("hasAuthority('demo:news:all')")
    public Result delete(@RequestBody Long[] ids){
        //效验数据
        AssertUtils.isArrayEmpty(ids, "id");

        newsService.deleteBatchIds(Arrays.asList(ids));

        return new Result();
    }

}