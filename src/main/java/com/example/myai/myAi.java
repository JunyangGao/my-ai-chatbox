package com.example.myai;

import dev.langchain4j.data.message.AiMessage;
import dev.langchain4j.data.message.SystemMessage;
import dev.langchain4j.data.message.UserMessage;
import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.model.chat.response.ChatResponse;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class myAi {
    @Resource
    private ChatModel qwenChatModel;
    private static final String SYSTEM_MESSAGE = """
            你好，这里可以设置预设的系统提示词。""";

    public String chat(String message){
        UserMessage userMessage =  UserMessage.from(message);
        SystemMessage systemMessage = SystemMessage.from(SYSTEM_MESSAGE);
        ChatResponse chatResponse1  = qwenChatModel.chat(systemMessage, userMessage);
        AiMessage aiMessage = chatResponse1.aiMessage();

        log.info("AI 输出：" + aiMessage.toString());
        return aiMessage.text();
    }

}
