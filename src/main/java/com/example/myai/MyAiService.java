package com.example.myai;

import dev.langchain4j.service.MemoryId;
import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import reactor.core.publisher.Flux;

import java.util.List;

public interface MyAiService {
    @SystemMessage(fromResource = "yangge-prompt.txt")
    String chat(String message);


    @SystemMessage(fromResource = "yangge-prompt.txt")
    Report chatWithReport(String message);

    record Report(String name, List<String> suggestionList){};

    //流式输出
    @SystemMessage(fromResource = "yangge-prompt.txt")
    Flux<String> chatStream(@MemoryId int memoryId, @UserMessage String message);

}
