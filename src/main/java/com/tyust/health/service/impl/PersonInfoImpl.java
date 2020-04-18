package com.tyust.health.service.impl;

import com.tyust.health.dao.PersonInfoMapper;
import com.tyust.health.entity.PersonInfo;
import com.tyust.health.service.PersonInfoService;
import com.tyust.health.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public PersonInfo getPersonInfoById(Integer id) {
        return personInfoMapper.selectByPrimaryKey(id);
    }

    /**
     * 查询用户列表并分页
     * 可查询的条件有：用户ID，用户名字（模糊查询），学院，班级（模糊查询），省份，城市，县区，
     * 人员类型，是否返校，返校批次，伪删除标记   （11个条件）
     * @param personInfo  携带某一部分用户信息的用户实体
     * @param pageIndex  页码
     * @param pageSize   页面大小
     * @return
     */
    @Override
    public List<PersonInfo> getPerSonInfoList(PersonInfo personInfo, int pageIndex, int pageSize) {
        //页码转换为数据库的行码
        int rowIndex = PageUtil.calculateRowIndex(pageIndex,pageSize);
        List<PersonInfo> personInfoList = personInfoMapper.selectPersonInfoList(personInfo,rowIndex,pageSize);

        return personInfoList;
    }
}
