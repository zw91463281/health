package com.tyust.health.dao;

import com.tyust.health.entity.PersonInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PersonInfoMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(PersonInfo record);

    int insertSelective(PersonInfo record);

    /**
     * 根据Id查询某一个用户的信息
     * @param userId   用户ID
     * @return    一个用户的信息
     */
    PersonInfo selectByPrimaryKey(Integer userId);

    /**
     * 查询用户列表并分页
     * 可查询的条件有：用户ID，用户名字（模糊查询），学院，班级（模糊查询），省份，城市，县区，人员类型，
     * 是否返校，返校批次,伪删除标记   （11个条件）
     * @param personInfo
     * @param rowIndex   数据库的行数（从0开始）
     * @param pageSize  页面大小
     * @return
     */
    List<PersonInfo> selectPersonInfoList(@Param("user")PersonInfo personInfo,@Param("rowIndex")int rowIndex,
                                          @Param("pageSize")int pageSize);

    int updateByPrimaryKeySelective(PersonInfo record);

    int updateByPrimaryKey(PersonInfo record);
}