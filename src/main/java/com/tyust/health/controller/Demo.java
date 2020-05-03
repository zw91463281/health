package com.tyust.health.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author 郭志武
 * @Date 2020/4/20 16:18
 * @Version 1.0
 */
@Controller
public class Demo {

    @RequestMapping("/lay")
    public String lay(){
        return "test/lay";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/index")
    public String index(){
        return "index/index";
    }

    @RequestMapping("/welcome")
    public String welcome(){
        return "index/welcome";
    }

    @RequestMapping("/menu1")
    public String menu1(){
        return "index/menu1";
    }

    @RequestMapping("/menu2")
    public String menu2(){
        return "index/menu2";
    }

}
