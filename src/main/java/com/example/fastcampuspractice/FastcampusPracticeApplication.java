package com.example.fastcampuspractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan//환경변수를 따로 빼놓았으니 읽거라
@SpringBootApplication
public class FastcampusPracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(FastcampusPracticeApplication.class, args);
    }

}
