package com.rabbit.product;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.rabbit.product.rabbit.DemoService;
import com.rabbit.product.rabbit.DemoService2;
import com.rabbit.product.test.StartTest;
import com.rabbit.product.test.StartTest1;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
@RunWith(SpringRunner.class)
@SpringBootTest
public class Test {

    @Autowired
    private StartTest startTest;
    @Autowired
    private StartTest1 startTest1;

    @Autowired
    private DemoService demoService;
    @Autowired
    private DemoService2 demoService2;
    @org.junit.Test
    public void start() throws Exception {
        String aa = demoService.demo();
        System.out.println(aa);
        System.out.println(demoService2.demo2());
    }
}
