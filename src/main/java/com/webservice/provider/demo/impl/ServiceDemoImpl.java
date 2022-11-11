package com.webservice.provider.demo.impl;

import com.webservice.provider.demo.ServiceDemo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.jws.WebService;

/**
 * ServiceDemoImpl
 * 服务端提供服务定义实现
 **/
@Slf4j
@Component
@WebService(name = "TestServiceDemo",targetNamespace = "http://service.webservice.com",
endpointInterface = "com.webservice.provider.demo.ServiceDemo")
public class ServiceDemoImpl implements ServiceDemo {

    /**
     * 服务端提供接口定义实现
     * @param param
     * @return
     */
    @Override
    public String test(String param) {
        log.info("test webservice receive {}",param);
        param = "hello "+param;
        return param;
    }
}