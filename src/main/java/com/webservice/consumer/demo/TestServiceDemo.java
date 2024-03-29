
package com.webservice.consumer.demo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10
 * Generated source version: 2.2
 * 
 */
@WebService(name = "TestServiceDemo", targetNamespace = "http://service.webservice.com")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface TestServiceDemo {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "test", targetNamespace = "http://service.webservice.com", className = "com.webservice.consumer.demo.Test")
    @ResponseWrapper(localName = "testResponse", targetNamespace = "http://service.webservice.com", className = "com.webservice.consumer.demo.TestResponse")
    public String test(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
