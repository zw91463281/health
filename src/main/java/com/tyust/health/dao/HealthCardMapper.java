package com.tyust.health.dao;

import com.tyust.health.entity.HealthCard;

public interface HealthCardMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HealthCard record);

    int insertSelective(HealthCard record);

    HealthCard selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HealthCard record);

    int updateByPrimaryKey(HealthCard record);
}