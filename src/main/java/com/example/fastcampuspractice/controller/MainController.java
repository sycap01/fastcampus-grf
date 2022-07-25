package com.example.fastcampuspractice.controller;

import com.example.fastcampuspractice.service.HelloService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

//@RestController //response body embeded
@Controller
@Slf4j
@RequiredArgsConstructor
public class MainController {
    //서비스의 변경에서 부터 자유로 울수없다
    // 아직은 의존성이 높지않음 , 존재자체가사라질때 혹은 이름이 아예바뀔때
    private final HelloService helloService; // member field

    @GetMapping("/main")
    public String main(@RequestParam String name, ModelMap modelMap, /*@RequestBody*/ AshleyRequest request) {
        String message = helloService.sayHello(name);
        log.warn("auto");
        modelMap.addAttribute("message",message);
        return "main/index";
    }

    @ResponseBody
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

