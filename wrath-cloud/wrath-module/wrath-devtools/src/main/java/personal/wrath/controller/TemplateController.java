

package personal.wrath.controller;

import com.google.common.collect.Maps;
import personal.wrath.commons.tools.exception.RenException;
import personal.wrath.commons.tools.page.PageData;
import personal.wrath.commons.tools.utils.Result;
import personal.wrath.entity.TemplateEntity;
import personal.wrath.service.TemplateService;
import personal.wrath.utils.GenUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;

/**
 * 模板管理
 *
 * @author Mark sunlightcs@gmail.com
 */
@RestController
@RequestMapping("template")
public class TemplateController {
    @Autowired
    private TemplateService templateService;

    @GetMapping("page")
    public Result<PageData<TemplateEntity>> page(@RequestParam Map<String, Object> params){
        PageData<TemplateEntity> page = templateService.page(params);

        return new Result<PageData<TemplateEntity>>().ok(page);
    }

    @GetMapping("{id}")
    public Result<TemplateEntity> get(@PathVariable("id") Long id){
        TemplateEntity data = templateService.selectById(id);

        return new Result<TemplateEntity>().ok(data);
    }

    @PostMapping
    public Result save(@RequestBody TemplateEntity entity){
        try {
            //检查模板语法是否正确
            GenUtils.getTemplateContent(entity.getContent(), Maps.newHashMap());
        } catch (Exception e) {
            throw new RenException("模板语法错误，请查看控制台报错信息！", e);
        }

        templateService.insert(entity);

        return new Result();
    }

    @PutMapping
    public Result update(@RequestBody TemplateEntity entity){
        try {
            //检查模板语法是否正确
            GenUtils.getTemplateContent(entity.getContent(), Maps.newHashMap());
        } catch (Exception e) {
            throw new RenException("模板语法错误，请查看控制台报错信息！", e);
        }
        templateService.updateById(entity);

        return new Result();
    }

    @DeleteMapping
    public Result delete(@RequestBody Long[] ids){
        templateService.deleteBatchIds(Arrays.asList(ids));

        return new Result();
    }

    /**
     * 启用
     */
    @PutMapping("enabled")
    public Result enabled(@RequestBody Long[] ids){
        templateService.updateStatusBatch(ids, 0);

        return new Result();
    }

    /**
     * 禁用
     */
    @PutMapping("disabled")
    public Result disabled(@RequestBody Long[] ids){
        templateService.updateStatusBatch(ids, 1);

        return new Result();
    }
}