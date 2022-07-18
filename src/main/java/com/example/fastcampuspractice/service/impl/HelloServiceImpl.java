package com.example.fastcampuspractice.service.impl;

import com.example.fastcampuspractice.properties.AshleyProperties;
import com.example.fastcampuspractice.service.HelloService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
@Slf4j // lombok anotation
@RequiredArgsConstructor
public class HelloServiceImpl implements HelloService {

    @Value("${ashley.english.hello}")// spring el (spEL)
    private String hello;

//    private final Environment env;
//    private final ApplicationContext context;
    private final AshleyProperties ashleyProperties;

    public String sayHello(@RequestParam String name) {
        log.warn("This is log !!");
        List<Integer> list = List.of(1, 2, 3, 4, 5);
//        String helloFromEnv = env.getProperty("uno.korean.hello"); // type
//        context.getEnvironment().getProperty("uno.korean.hello");
        return ashleyProperties.english().hello()+", " + name + "!!!";
    }
}
