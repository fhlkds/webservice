package com.webservice;

import com.alibaba.fastjson.JSON;
import com.webservice.consumer.business.BusinessCenterService;
import com.webservice.consumer.demo.ServiceDemoImplService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * 单元测试
 * http://soa.joyoung.com/gateway/export/BusinessCenterService?wsdl
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = WebserviceApplication.class)
public class WebserviceApplicationTests {

    @Resource
    private ServiceDemoImplService serviceDemoImplService;


    @Test
    public void contextLoads() {
    }



    @Test
    public void demoTest() {
        String test = serviceDemoImplService.getTestServiceDemoPort().test("张三");
        System.out.println(test);
    }







}
