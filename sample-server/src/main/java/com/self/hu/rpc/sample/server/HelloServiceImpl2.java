package com.self.hu.rpc.sample.server;

import com.self.hu.rpc.sample.server.api.HelloService;
import com.self.hu.rpc.sample.server.vo.Person;
import com.self.hu.rpc.server.RpcService;

@RpcService(value = HelloService.class, version = "sample.hello2")
public class HelloServiceImpl2 implements HelloService {
    @Override
    public String hello(String name) {
        return "Hello! " + name;
    }

    @Override
    public String hello(Person person) {
        return "Hello! " + person.getFirstName() + " " + person.getLastName();
    }
}
