package com.JPAdemo.JPAdemo.controller;

import com.JPAdemo.JPAdemo.modle.DateTest1;
import com.JPAdemo.JPAdemo.modle.DateTest2;
import com.JPAdemo.JPAdemo.modle.DateTest3;
import com.JPAdemo.JPAdemo.repository.DateTest3Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by dell on 2017/8/8.
 */
@RestController
public class demoController {
    //测试Date与json格式的相互转换------全局配置
    @GetMapping("/1")
    public DateTest1 test1(){
        DateTest1 dateTest1=new DateTest1();
        dateTest1.setDate(new Date());
        return dateTest1;
    }

    //测试Date与json格式的相互转换------局部注解
    @GetMapping("/2")
    public DateTest2 test2(){
        DateTest2 dateTest2=new DateTest2();
        dateTest2.setDate1(new Date());
        dateTest2.setDate2(new Date());
        dateTest2.setDate3(new Date());
        return dateTest2;
    }

    @Autowired
    DateTest3Repository dateTest3Repository;
    //测试Date在数据库中的存取
    @GetMapping("/3")
    public void test3(){
        DateTest3 dateTest3=new DateTest3();
        dateTest3.setDate1(new Date());
        dateTest3.setDate2(new Date());
        dateTest3.setDate3(new Date());
        dateTest3Repository.save(dateTest3);
    }
}
