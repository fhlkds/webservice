package com.webservice.config;

import com.webservice.consumer.demo.ServiceDemoImplService;
import com.webservice.provider.demo.ServiceDemo;
import org.apache.cxf.Bus;
import org.apache.cxf.bus.spring.SpringBus;

import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import javax.xml.ws.Endpoint;

/**
 * WebServiceConfig
 *
 * webservice配置类
 *
 **/
@Configuration
public class WebServiceConfiguration {

    /**
     * webservice服务端路径
     */
    private final static String WEBSERVICE_PATH = "/ws/api";

    @Resource
    private ServiceDemo serviceDemo;

    @Bean(name = Bus.DEFAULT_BUS_ID)
    public SpringBus springBus(){
        return new SpringBus();
    }

    @Bean
    public Endpoint endpoint(){
        EndpointImpl endpoint = new EndpointImpl(springBus(), serviceDemo);
        endpoint.publish(WEBSERVICE_PATH);
        return endpoint;
    }

    /**
     * demo客户端的调用实现注入容器
     * 所有的客户端实现接口都要注入
     * @return
     */
    @Bean
    public ServiceDemoImplService serviceDemoImplService(){
        return new ServiceDemoImplService();
    }

}