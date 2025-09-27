package com.example.myai;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MyAiServiceTest {
    @Resource
    private MyAiService myAiService;
    @Test
    void chatWithReport() {
        String userMessage = "你好，请介绍一下Spring Boot";
        MyAiService.Report report = myAiService.chatWithReport(userMessage);
        System.out.println(report);
    }
}