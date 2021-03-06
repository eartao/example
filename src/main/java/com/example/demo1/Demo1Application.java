package com.example.demo1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.demo1.mapper")
public class Demo1Application {

    public static void main(String[] args) {
        System.out.println("-------------项目启动中---------------------------");
        SpringApplication.run(Demo1Application.class, args);
        System.out.println("-------------项目启动完毕---------------------------");
    }

}
