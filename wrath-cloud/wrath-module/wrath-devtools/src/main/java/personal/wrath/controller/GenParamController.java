

package personal.wrath.controller;

import com.google.gson.Gson;
import personal.wrath.commons.tools.utils.Result;
import personal.wrath.entity.GenParam;
import personal.wrath.remote.ParamsRemoteService;
import personal.wrath.utils.ModuleConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 代码生成参数配置
 *
 * @author Mark sunlightcs@gmail.com
 */
@RestController
@RequestMapping("param")
public class GenParamController {
    @Autowired
    private ParamsRemoteService paramsRemoteService;

    @GetMapping("info")
    public Result<GenParam> info(){
        GenParam param = paramsRemoteService.getValueObject(ModuleConstant.DEV_TOOLS_PARAM_KEY, GenParam.class);

        return new Result<GenParam>().ok(param);
    }

    @PostMapping
    public Result saveConfig(@RequestBody GenParam param){
        paramsRemoteService.updateValueByCode(ModuleConstant.DEV_TOOLS_PARAM_KEY, new Gson().toJson(param));

        return new Result();
    }
}