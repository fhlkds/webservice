## **1 结构**

webservice

config  webservice相关配置

consumer  webservice客户端

provider  webservice服务端

![img](d09d8723-e93d-4497-9409-119e746f7067.png)



## **2 新增客户端**

### **2.1 修改pom文件**

![img](2a1ee72c-e169-47b7-9f94-6d9bea7c8694.png)

修改packageName 改为生成代码的包

修改wsdlUrl 服务端的地址

### **2.2 生成客户端代码**

![img](1b44d3e2-c152-4cfe-80bb-e7beaafa9af5.png)

点击生成客户端代码，结果可在packageName路径查看。



### **2.3 客户端接口注入spring容器**

![img](85ab97a3-dc4a-4156-b1bf-15a0fc488d3e.png)

也可以直接new出来，不建议。



### **2.4 单元测试**

![img](8cb8b460-72f1-4c79-8b05-1853df305347.png)



## **3 新增服务端**

### **3.1 定义服务和接口及其实现**

![img](cb10083d-fe94-4a0f-b49d-13a9bcd1ddc2.png)

已实现，可直接新增接口方法及实现即可。

也可以在当前包下新增服务端的类及其实现，但是要修改下配置类的（如下）

```java
    @Bean
    public Endpoint endpoint(){
        EndpointImpl endpoint = new EndpointImpl(springBus(), 修改为新增服务的bean);
        endpoint.publish(WEBSERVICE_PATH);
        return endpoint;
    }
```