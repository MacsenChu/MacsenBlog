package xyz.macsen.message.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.macsen.message.mapper.MessageMapper;
import xyz.macsen.message.mapper.MessageReplyMapper;
import xyz.macsen.message.pojo.Message;
import xyz.macsen.message.pojo.MessageInput;
import xyz.macsen.message.pojo.MessageReply;
import xyz.macsen.message.service.MessageService;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageMapper messageMapper;

    @Autowired
    private MessageReplyMapper messageReplyMapper;

    /**
     * 查询留言列表
     * @return
     */
    @Override
    public List<Message> findAllMessage() {
        return messageMapper.findAllMessage();
    }

    @Override
    public void addMessage(MessageInput messageInput) {

        if (messageInput.getReplyType() == null) {
            Message message = new Message();
            BeanUtils.copyProperties(messageInput, message);
            message.setComment(messageInput.getContent());
            messageMapper.insertSelective(message);
        } else {
            MessageReply messageReply = new MessageReply();
            BeanUtils.copyProperties(messageInput, messageReply);
            messageReply.setFromName(messageInput.getName());
            messageReply.setComment(messageInput.getContent());
            messageReplyMapper.insertSelective(messageReply);
        }

    }
}
