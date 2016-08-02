package com.zl.ssm.controller;

import com.zl.ssm.mapper.UserMapper;
import com.zl.ssm.pojo.User;
import com.zl.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by zhangli on 16/8/1 17:19.</br>
 */
@Controller
public class HelloWorld {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/hello")
    @ResponseBody
    public List<User> index() {

        UserMapper userMapper = userService.getUserMapper();
        return userMapper.selectAll();
    }
}
