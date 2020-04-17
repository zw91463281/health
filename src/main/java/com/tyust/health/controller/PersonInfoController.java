package com.tyust.health.controller;

import com.tyust.health.entity.PersonInfo;
import com.tyust.health.exception.GlobalException;
import com.tyust.health.result.CodeMsg;
import com.tyust.health.result.Result;
import com.tyust.health.service.PersonInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;


/**
 * @Author 郭志武
 * @Date 2020/4/17 17:40
 * @Version 1.0
 */
@Controller
@RequestMapping("/user")
public class PersonInfoController {

    @Autowired
    private PersonInfoService personInfoService;

    /**
     * 根据Id查询用户信息
     * URL例子：localhost:8080/user/getpersoninfobyid/1
     * @param userId
     * @return
     */
    @RequestMapping("/getpersoninfobyid/{userId}")
    @ResponseBody
    public Result getPersonInfoById(@PathVariable(value = "userId") Integer userId){
        //参数判断
        if (userId != null && userId >= 0){
            ArrayList dataList = new ArrayList();
            //执行业务层
            PersonInfo personInfo = personInfoService.getPersonInfoById(userId);
            //添加到list中
            dataList.add(personInfo);
            return Result.success(dataList);
        }else {
            throw new GlobalException(CodeMsg.USER_NO_EXIST);
        }

    }
}
