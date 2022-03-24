package com.self.hu.rpc.sample.server.api;


import com.self.hu.rpc.sample.server.vo.Person;

public interface HelloService {
    String hello(String name);

    String hello(Person person);
}
