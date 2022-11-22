

package personal.wrath.controller;

import personal.wrath.commons.tools.utils.Result;
import personal.wrath.commons.tools.validator.ValidatorUtils;
import personal.wrath.entity.UserEntity;
import personal.wrath.dto.RegisterDTO;
import personal.wrath.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * 注册接口
 *
 * @author Mark sunlightcs@gmail.com
 */
@RestController
@RequestMapping("register")
@Api(tags="注册接口")
public class ApiRegisterController {
    @Autowired
    private UserService userService;

    @PostMapping
    @ApiOperation("注册")
    public Result register(@RequestBody RegisterDTO dto){
        //表单校验
        ValidatorUtils.validateEntity(dto);

        UserEntity user = new UserEntity();
        user.setMobile(dto.getMobile());
        user.setUsername(dto.getMobile());
        user.setPassword(DigestUtils.sha256Hex(dto.getPassword()));
        user.setCreateDate(new Date());
        userService.insert(user);

        return new Result();
    }
}