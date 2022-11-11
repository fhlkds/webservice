package com.webservice;

import com.webservice.consumer.demo.ServiceDemoImplService;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;


/**
 * 测试
 *
 **/
public class Test {

    public static void main(String[] args) {
//        invokeService_2();
        t1();
    }
    public static void invokeService_2(){
        // 创建动态客户端
        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
        Client client = dcf.createClient("http://localhost:8080/services/ws/api?wsdl");
        // 需要密码的情况需要加上用户名和密码
        // client.getOutInterceptors().add(new ClientLoginInterceptor(USER_NAME, PASS_WORD));
        Object[] objects = new Object[0];
        try {
            // invoke("方法名",参数1,参数2,参数3....);
            //这里注意如果是复杂参数的话，要保证复杂参数可以序列化
            objects = client.invoke("test", "张三");
            System.out.println("返回数据:" + objects[0]);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public static void t1(){
        ServiceDemoImplService serviceDemoImplService = new ServiceDemoImplService();
        String test = serviceDemoImplService.getTestServiceDemoPort().test("1111");
        System.out.println(test);

    }

}