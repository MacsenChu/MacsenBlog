package xyz.macsen.message.mapper;

import tk.mybatis.mapper.common.Mapper;
import xyz.macsen.message.pojo.Message;

import java.util.List;

public interface MessageMapper extends Mapper<Message> {

    List<Message> findAllMessage();
}
