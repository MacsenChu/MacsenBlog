package xyz.macsen.message.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xyz.macsen.common.utils.StatusCode;
import xyz.macsen.common.vo.Result;
import xyz.macsen.message.pojo.Message;
import xyz.macsen.message.pojo.MessageInput;
import xyz.macsen.message.service.MessageService;

import java.util.List;

@RestController
@RequestMapping("/message")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping
    public Result<List<Message>> findAllMessage() {
        List<Message> messages = messageService.findAllMessage();
        return new Result<List<Message>>(true, StatusCode.OK, "留言列表获取成功", messages);
    }

    @PostMapping
    public Result<Void> postMessage(@RequestBody MessageInput messageInput) {
        messageService.addMessage(messageInput);
        return new Result<Void>(true, StatusCode.CREATED, "留言成功");
    }
}
