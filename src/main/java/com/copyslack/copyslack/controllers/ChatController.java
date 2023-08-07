package com.copyslack.copyslack.controllers;



import com.copyslack.copyslack.model.entity.Chat;
import com.copyslack.copyslack.model.entity.User;

import java.util.List;

public interface ChatController {
Chat addChat (Chat chat);
Chat getChat(Long id);
List<Chat> getByUser(User user);
Chat updateChat (String name, String photoUrl, String description,Long id);
Chat deleteChat (Long id);

}
