package com.example.myai;

import dev.langchain4j.data.message.ChatMessage;
import dev.langchain4j.memory.ChatMemory;
import dev.langchain4j.memory.chat.MessageWindowChatMemory;
import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.model.chat.StreamingChatModel;
import dev.langchain4j.service.AiServices;
import jakarta.annotation.Resource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyAiServiceFactory {
    @Resource
    private ChatModel qwenChatModel;

    @Resource
    private StreamingChatModel qwenStreamingChatModel;


    @Bean
    public MyAiService myAiService() {
        ChatMemory chatMemory = MessageWindowChatMemory.withMaxMessages(10);
        MyAiService myAiService = AiServices.builder(MyAiService.class)
                .chatModel(qwenChatModel)
                .streamingChatModel(qwenStreamingChatModel) //流式输出
                .chatMemory(chatMemory)
                .chatMemoryProvider(memoryId -> MessageWindowChatMemory.withMaxMessages(10)) //每个会话独立存储
                .build();
        return myAiService;
    }

}
