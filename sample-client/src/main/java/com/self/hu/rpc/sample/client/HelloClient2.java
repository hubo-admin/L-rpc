package com.self.hu.rpc.sample.client;

import com.self.hu.rpc.client.RpcProxy;
import com.self.hu.rpc.sample.server.vo.Person;
import com.self.hu.rpc.sample.server.api.HelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloClient2 {
    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        RpcProxy rpcProxy = context.getBean(RpcProxy.class);

        HelloService helloService = rpcProxy.create(HelloService.class);
        String result = helloService.hello(new Person("Hu", "Bo"));
        System.out.println(result);

        System.exit(0);
    }
}
