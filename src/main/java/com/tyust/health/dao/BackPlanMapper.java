package com.tyust.health.dao;

import com.tyust.health.entity.BackPlan;

public interface BackPlanMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BackPlan record);

    int insertSelective(BackPlan record);

    BackPlan selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BackPlan record);

    int updateByPrimaryKey(BackPlan record);
}