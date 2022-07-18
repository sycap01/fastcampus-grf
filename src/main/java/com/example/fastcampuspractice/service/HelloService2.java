package com.example.fastcampuspractice.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

import java.util.List;

@RequestScope // 요청할때 마다 싱글톤 패턴을 변경해서 매번 새로 호출해달라고 요청하는 기능  : 원하는 설계에 따라서 선택적으로 사용
public class HelloService2 {

    public String sayHello(String name) {
        List<Integer> list = List.of(1, 2, 3, 4, 5);

        return "안녕, " + name + "!!!";
    }
}
