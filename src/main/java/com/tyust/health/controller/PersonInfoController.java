package com.tyust.health.controller;

import com.tyust.health.entity.PersonInfo;
import com.tyust.health.exception.GlobalException;
import com.tyust.health.result.CodeMsg;
import com.tyust.health.result.Result;
import com.tyust.health.service.PersonInfoService;
import com.tyust.health.util.HttpServletRequesyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;


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
     * 前端Ajax访问用例：user/getpersoninfobyid/+userId
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

    /**
     * 获取指定查询条件下的用户信息列表
     *
     * @param pageIndex  页码
     * @param pageSize  页面大小
     * @param request
     * @return
     */
    @RequestMapping(value = "/getpersoninfolist",method = RequestMethod.GET)
    @ResponseBody
    public Result getPersonInfoList(@RequestParam(value = "pageIndex")int pageIndex,
                                    @RequestParam(value = "pageSize")int pageSize,
                                    HttpServletRequest request){
        //参数非空判断
        if (pageIndex > -1 && pageSize > -1){
            //用户ID，用户名字（模糊查询），学院，班级（模糊查询），省份，城市，县区，人员类型，是否返校，返校批次,伪删除标记
            //尝试获取用户ID
            int userId = HttpServletRequesyUtil.getInt(request,"userId");
            //尝试获取用户名字
            String name = HttpServletRequesyUtil.getString(request,"name");
            //尝试获取学院
            int colleage = HttpServletRequesyUtil.getInt(request,"colleage");
            //尝试获取班级
            String studentClass = HttpServletRequesyUtil.getString(request,"studentClass");
            //尝试获取省份
            String province = HttpServletRequesyUtil.getString(request,"province");
            //尝试获取城市
            String city = HttpServletRequesyUtil.getString(request,"city");
            //尝试获取县区
            String county = HttpServletRequesyUtil.getString(request,"county");
            //尝试获取人员类型
            int userType = HttpServletRequesyUtil.getInt(request,"userType");
            //尝试获取是否返校
            boolean isBackSchool = HttpServletRequesyUtil.getBoolean(request,"isBackSchool");
            //尝试获取返校批次
            int batchId = HttpServletRequesyUtil.getInt(request,"batchId");
            //尝试获取伪删除标记
            int flag = HttpServletRequesyUtil.getInt(request,"flag");
            //组合查询条件
            PersonInfo personInfo = compactPersonInfoSearch(userId,name,colleage,studentClass,province,city,county,userType,isBackSchool,batchId,flag);
            //根据查询条件和分页信息获取用户信息列表
            List<PersonInfo> personInfoList = personInfoService.getPerSonInfoList(personInfo,pageIndex,pageSize);
            return Result.success(personInfoList);
        }else {
            throw new GlobalException(CodeMsg.EMPTY_PAGESIZE_OR_PAGEINDEX);
        }


    }

    /**
     * 组合查询条件，并将结果封装到一个PersonInfo对象里返回
     * @param userId  用户Id
     * @param name   名字
     * @param colleage  学院
     * @param studentClass   班级
     * @param province   省份
     * @param city     城市
     * @param county    县区
     * @param userType  用户类型
     * @param isBackSchool  是否返校
     * @param batchId   返校批次
     * @param flag  伪删除标记
     * @return
     */
    private PersonInfo compactPersonInfoSearch(int userId, String name, int colleage, String studentClass,
                                               String province, String city, String county, int userType,
                                               boolean isBackSchool, int batchId,int flag) {
        PersonInfo personInfo = new PersonInfo();
        if (userId != -1){
            personInfo.setUserId(userId);
        }
        if (name != null){
            personInfo.setName(name);
        }
        if (colleage != -1){
            personInfo.setCollege(colleage);
        }
        if (studentClass != null){
            personInfo.setStudentClass(studentClass);
        }
        if (province != null){
            personInfo.setProvince(province);
        }
        if(city != null){
            personInfo.setCity(city);
        }
        if (county != null){
            personInfo.setCounty(county);
        }
        if (userType != -1){
            personInfo.setUserType(userType);
        }
        if (isBackSchool != false){
            personInfo.setIsBackSchool(isBackSchool);
        }
        if (batchId != -1){
            personInfo.setBatchId(batchId);
        }
        if (flag != -1){
            personInfo.setFlag(flag);
        }

        return personInfo;
    }


}
