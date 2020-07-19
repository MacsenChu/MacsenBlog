package xyz.macsen.message.service;

import xyz.macsen.message.pojo.Message;
import xyz.macsen.message.pojo.MessageInput;

import java.util.List;

public interface MessageService {

    /**
     * 查询留言列表
     * @return
     */
    List<Message> findAllMessage();

    /**
     * 提交留言
     * @param messageInput
     */
    void addMessage(MessageInput messageInput);
}
