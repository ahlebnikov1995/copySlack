package com.copyslack.copyslack.controllers;



import com.copyslack.copyslack.model.entity.Chat;
import com.copyslack.copyslack.model.entity.User;

import java.util.List;

public interface UserController {
    User addUser(User user);
    List<User> getByChat(Chat chat);
    User getUser(Long id);
    User updateUser (String name,Long id);
    User addChat(Chat chat,Long id);
    User delete (Long id);
}
