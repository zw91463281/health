package com.tyust.health.dao;

import com.tyust.health.HealthApplication;
import com.tyust.health.entity.PersonInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @Author 郭志武
 * @Date 2020/4/18 14:42
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = HealthApplication.class)
public class PersonInfoDaoTest {

    @Autowired
    private PersonInfoMapper personInfoMapper;

    @Test
    public void testSelectByPrimaryKey(){
        PersonInfo personInfo = new PersonInfo();
        personInfo.setName("李");
//        personInfo.setBatchId(4);
//        personInfo.setIsBackSchool(true);
        List<PersonInfo> list = personInfoMapper.selectPersonInfoList(personInfo,
                0,10);
        System.out.println(list);

    }
}
