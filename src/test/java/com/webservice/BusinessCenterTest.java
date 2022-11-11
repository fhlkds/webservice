package com.webservice;

import com.alibaba.fastjson.JSON;
import com.webservice.consumer.business.BusinessCenterService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = WebserviceApplication.class)
public class BusinessCenterTest {


    @Resource
    private BusinessCenterService businessCenterService;



    @Test
    public void business(){
        List<String> strings = businessCenterService.getBusinessCenterServicePort().callService("", "", "", "",
                "", "", "");
        System.out.printf(JSON.toJSONString(strings));

    }
}
