package com.self.hu.rpc.sample.server;

import com.self.hu.rpc.sample.server.api.HelloService;
import com.self.hu.rpc.sample.server.vo.Person;
import com.self.hu.rpc.server.RpcService;

@RpcService(HelloService.class)
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello(String name) {
        return "Hello! " + name;
    }

    @Override
    public String hello(Person person) {
        return "Hello! " + person.getFirstName() + " " + person.getLastName();
    }
}
