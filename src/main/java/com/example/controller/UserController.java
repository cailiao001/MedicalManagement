package com.example.controller;


import com.example.common.R;
import com.example.pojo.User;
import com.example.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author author
 * @since 2023-11-08
 */
@Api(tags = "用户管理接口")
@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/user")
public class UserController {

    public final IUserService userService;

    @ApiOperation("用户注册")
    @PostMapping("/register")
    public R<String> register(@RequestBody User user) {
        try {
            userService.register(user);
        } catch (RuntimeException e){
            e.printStackTrace();
            return R.error(e.getMessage());
        }
        log.info("注册成功.......................");
        return R.success("注册成功");
    }


    @ApiOperation("用户登录")
    @PostMapping("/login")
    public R<User> login(String email,String password,HttpServletRequest request) {
        User us = null;
        try {
            us = userService.login(email,password);
        } catch (RuntimeException e){
            e.printStackTrace();
            return R.error(e.getMessage());
        }
        log.info("登陆成功.........................");
        request.getSession().setAttribute("user",us);
        return R.success(us);
    }

}
