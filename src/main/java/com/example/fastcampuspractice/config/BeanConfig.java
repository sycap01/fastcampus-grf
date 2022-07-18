package com.example.fastcampuspractice.config;

import com.example.fastcampuspractice.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
//    @Bean // Service 로 안하고 Bean 을 등록하여 쓰는 경우  ? 구현을 한 주체가 서비스를 붙일수 없음
    //인스턴스를 만드는방법 또는 권한을 내가 가지고 있는지 없는지
    //내가 등록할때 Service 할수없을 경우 Bean
    // bean 은 코드안에 들어가서 코드에 접근할 수 없을 경우가 있음 / 그럴경우 new 로 등록
    // 서드파티 등록 할때
   /* public HelloService helloServiceImpl(){
        return new HelloService();
    }*/
}
