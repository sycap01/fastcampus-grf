package com.example.fastcampuspractice.controller;

import com.example.fastcampuspractice.service.HelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MainController {
    //서비스의 변경에서 부터 자유로 울수없다
    // 아직은 의존성이 높지않음 , 존재자체가사라질때 혹은 이름이 아예바뀔때
    private final HelloService helloService; // member field

    @GetMapping("/api/main")
    public String main (@RequestParam String name){

        return helloService.sayHello(name);
    }
}

