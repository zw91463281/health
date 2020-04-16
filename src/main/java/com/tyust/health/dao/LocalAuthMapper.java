package com.tyust.health.dao;

import com.tyust.health.entity.LocalAuth;

public interface LocalAuthMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LocalAuth record);

    int insertSelective(LocalAuth record);

    LocalAuth selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LocalAuth record);

    int updateByPrimaryKey(LocalAuth record);
}