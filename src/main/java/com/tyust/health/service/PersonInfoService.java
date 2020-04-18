package com.tyust.health.service;


import com.tyust.health.entity.PersonInfo;

import java.util.List;

/**
 * @Author 郭志武
 * @Date 2020/4/17 14:15
 * @Version 1.0
 */
public interface PersonInfoService {

    /**
     * 根据id查询用户信息
     * @param id
     * @return
     */
    PersonInfo getPersonInfoById(Integer id);

    /**
     * 查询用户列表并分页
     * 可查询的条件有：用户ID，用户名字（模糊查询），学院，班级（模糊查询），省份，城市，县区，
     * 人员类型，是否返校，返校批次，伪删除标记   （11个条件）
     * @param personInfo  携带某一部分用户信息的用户实体
     * @param pageIndex  页码
     * @param pageSize   页面大小
     * @return
     */
    List<PersonInfo> getPerSonInfoList(PersonInfo personInfo, int pageIndex,int pageSize);
}
