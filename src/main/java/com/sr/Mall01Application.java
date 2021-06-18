package com.sr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.sr.dao")
public class Mall01Application {

    public static void main(String[] args) {
        SpringApplication.run(Mall01Application.class, args);
    }

}
