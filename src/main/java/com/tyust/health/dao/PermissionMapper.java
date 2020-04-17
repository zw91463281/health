package com.tyust.health.dao;

import com.tyust.health.entity.Permission;
import org.apache.ibatis.annotations.Mapper;


public interface PermissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Permission record);

    int insertSelective(Permission record);

    Permission selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);
}