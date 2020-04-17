package com.tyust.health.service;


import com.tyust.health.entity.PersonInfo;

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
}
