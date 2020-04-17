package com.tyust.health.controller;

import com.tyust.health.dao.PersonInfoMapper;
import com.tyust.health.entity.PersonInfo;
import com.tyust.health.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * 测试的小用例
 * @Author 郭志武
 * @Date 2020/4/11 21:52
 * @Version 1.0
 */
@Controller
public class DemoController {

    @Autowired
    private PersonInfoMapper personInfoMapper;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "hello";
    }

    /**
     * LayUI的测试
     * @return
     */
    @RequestMapping(value = "/lay",method = RequestMethod.GET)
    public String lay(){
        return "lay";
    }

    /**
     * Restful API JSON输出
     */
    @RequestMapping(value = "/result")
    @ResponseBody
    public Result result(){
        ArrayList list = new ArrayList();
        list.add(100);
        list.add(100);
        list.add("11");
        return Result.success(list);
    }

    /**
     * 数据库测试
     */
    @RequestMapping(value = "dbget")
    @ResponseBody
    public Result dbGet(){
        ArrayList list = new ArrayList();
        PersonInfo personInfo = personInfoMapper.selectByPrimaryKey(1);
        list.add(personInfo);
        return Result.success(list);
    }
}
