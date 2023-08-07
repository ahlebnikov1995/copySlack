package com.copyslack.copyslack.controllers;


import com.copyslack.copyslack.model.entity.Chat;
import com.copyslack.copyslack.model.entity.User;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class ChatControllerC implements ChatController {
    // поля - сервис чатов и сервис пользователей

    @Override
    @PostMapping("/addChat")
    public Chat addChat(@RequestBody Chat chat) {  //подаётся без id и с единственным челом в списке юзеров (создателем)
        return null;
    }

    @Override
    @GetMapping("/getChat/{id}")
    public Chat getChat(@PathVariable Long id) {
        return null;
    }

    @Override
    @GetMapping("/getChatByUser")
    public List<Chat> getByUser(@RequestBody User user) {
        // в сервисе забирается юзер из базы, потом возвращается его поле чатов
        return null;
    }

    @Override
    @PutMapping("/Chat/{name}/{photoUrl}/{description}/{id}")
    public Chat updateChat(@PathVariable String name,
                           @PathVariable String photoUrl,
                           @PathVariable String description,
                           @PathVariable Long id) {
        return null;
    }

    @Override
    @DeleteMapping("/Chat/{id}")
    public Chat deleteChat(@PathVariable Long id) {
        //не забыть в сервисе про метод из модели (да, для каждого юзера чата)
        return null;
    }
}
