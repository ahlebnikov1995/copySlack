package com.copyslack.copyslack.controllers;



import com.copyslack.copyslack.model.entity.Chat;
import com.copyslack.copyslack.model.entity.Message;
import com.copyslack.copyslack.model.entity.User;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public interface MessageController {
    Message addMes(String value, Chat chat, User author, Date createTime);
    List<Message> getByChat (Chat chat);
    List<Message> getByAuthorAndChat(User author, Chat chat);
    List<Message> getByValue(String value);
    Message updateMes(String value,UUID uid);
    Message deleteMes(UUID uid);
}
