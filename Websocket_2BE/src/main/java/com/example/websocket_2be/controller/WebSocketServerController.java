package com.example.websocket_2be.controller;
import com.example.websocket_2be.model.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketServerController {

    @MessageMapping("/chat")
    //Phương thức sẽ được gọi và trả về cho client mỗi khi có tin nhắn được gửi tới endpoint /app/chat ở phía client
    @SendTo("/topic/messages")
    // Tự động khi phương thức được gọi sẽ trả về tin nhắn cho những client đăng ký ở /topic/messages
    public Message sendMessage(Message message) {
        return message;
    }
}