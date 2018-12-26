package cn.itcast.dubboxdemo.controller;

import cn.itcast.dubboxdemo.service.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户管理
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Reference
    private UserService userService;

    //获取用户名
    @RequestMapping("/getName")
    public String getName(){
        return userService.getName();
    }


}
