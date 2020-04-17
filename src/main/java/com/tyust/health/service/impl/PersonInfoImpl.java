package com.tyust.health.service.impl;

import com.tyust.health.dao.PersonInfoMapper;
import com.tyust.health.entity.PersonInfo;
import com.tyust.health.service.PersonInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author 郭志武
 * @Date 2020/4/17 14:31
 * @Version 1.0
 */
@Service
public class PersonInfoImpl implements PersonInfoService {

    @Autowired
    private PersonInfoMapper personInfoMapper;

    @Override
    public PersonInfo getPersonInfo(Integer id) {
        return personInfoMapper.selectByPrimaryKey(id);
    }
}
