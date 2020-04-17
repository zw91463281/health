package com.tyust.health.dao;

import com.tyust.health.entity.BackPlan;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BackPlanMapper {

    /**
     * 根据id删除一条返校计划表
     * @param id  主键ID
     * @return  Mybatis设置删除成功获得1，失败为0，
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *插入一条返校计划
     * 给所有字段赋值，可以插入null值
    * @param record
     * @return
     */
    int insert(BackPlan record);

    /**
     *插入一条返校计划
     * 给有值的字段赋值，（进行非空判断）
     * @param record
     * @return
     */
    int insertSelective(BackPlan record);

    /**
     * 根据ID查询返校计划表
     * @param id
     * @return
     */
    BackPlan selectByPrimaryKey(Integer id);

    /**
     *更新不为空的字段
     * 如果只想更新某一字段，可以用这个方法
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(BackPlan record);

    /**
     * 更新注入的字段，会将空的字段在数据库中设置为null
     * @param record
     * @return
     */
    int updateByPrimaryKey(BackPlan record);
}