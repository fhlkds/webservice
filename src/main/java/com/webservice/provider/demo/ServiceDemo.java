package com.webservice.provider.demo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * ServerServiceDemo
 * 服务端提供服务定义
 **/
@WebService(name = "TestServiceDemo",targetNamespace = "http://service.webservice.com")
public interface ServiceDemo {

    /**
     * 服务端提供接口定义
     * @param data
     * @return
     */
    @WebMethod
    String test(@WebParam String data);


}