
package com.example;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Concumer {
    
    @KafkaListener(topics =  "appTopic", groupId = "group1")
    public void listenMessage(String message){
        System.out.println(message);
    }
}
