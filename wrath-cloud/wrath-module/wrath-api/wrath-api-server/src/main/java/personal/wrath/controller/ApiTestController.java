

package personal.wrath.controller;

import personal.wrath.annotation.Login;
import personal.wrath.annotation.LoginUser;
import personal.wrath.commons.tools.utils.Result;
import personal.wrath.dto.UploadDTO;
import personal.wrath.entity.UserEntity;
import personal.wrath.feign.OssFeignClient;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.annotations.ApiIgnore;

/**
 * 测试接口
 *
 * @author Mark sunlightcs@gmail.com
 */
@RestController
@RequestMapping("test")
@Api(tags="测试接口")
public class ApiTestController {
    @Autowired
    private OssFeignClient ossFeignClient;

    @Login
    @GetMapping("userInfo")
    @ApiOperation(value="获取用户信息", response=UserEntity.class)
    public Result<UserEntity> userInfo(@ApiIgnore @LoginUser UserEntity user){
        return new Result<UserEntity>().ok(user);
    }

    @Login
    @GetMapping("userId")
    @ApiOperation("获取用户ID")
    public Result<Long> userInfo(@ApiIgnore @RequestAttribute("userId") Long userId){
        return new Result<Long>().ok(userId);
    }

    @GetMapping("notToken")
    @ApiOperation("忽略Token验证测试")
    public Result<String> notToken(){
        return new Result<String>().ok("无需token也能访问。。。");
    }

    @PostMapping("upload")
    @ApiOperation(value = "上传文件")
    public Result<UploadDTO> upload(@RequestParam("file") MultipartFile file) {
        Result<UploadDTO> dto = ossFeignClient.upload(file);

        return dto;
    }
}