package com.example.myai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.myai", "controller"})
public class MyaiApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyaiApplication.class, args);
    }

}
