package com.zl.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zhangli on 16/8/1 17:19.</br>
 */
@Controller
public class HelloWorld {

    @RequestMapping(value = "/hello")
    @ResponseBody
    public String index() {
        return "index";
    }
}
