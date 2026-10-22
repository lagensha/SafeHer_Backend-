package org.government.Authentication.Controller;

import lombok.RequiredArgsConstructor;
import org.government.Authentication.DTO.ChatDTO;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@Controller
public class ChatController {
    @MessageMapping("/sendMessage")
    @SendTo("/topic/messages")
    public ChatDTO sendMessage(ChatDTO chatDTO) {
        return chatDTO;
    }
    @GetMapping("/chat")
   public String chat(){
        return "chat";
   }
}
