package com.example.fastcampuspractice.controller;

import com.example.fastcampuspractice.service.HelloService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@RestController
@RequiredArgsConstructor
public class MainController {
    //서비스의 변경에서 부터 자유로 울수없다
    // 아직은 의존성이 높지않음 , 존재자체가사라질때 혹은 이름이 아예바뀔때
    private final HelloService helloService; // member field

    @GetMapping("/api/main")
    public String main(@RequestParam String name, /*@RequestBody*/ AshleyRequest request) {

        return helloService.sayHello(name);
    }

    @PostMapping("/api/validation")
    public String validation(@Valid @RequestBody AshleyRequest request) {
        return "good";
    }

    public record AshleyRequest(
            @NotBlank String name, //
            @Min(10) Integer age //bean validation
    ) {

    }

}

