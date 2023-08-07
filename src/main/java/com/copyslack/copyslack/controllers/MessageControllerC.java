package com.copyslack.copyslack.controllers;


import com.copyslack.copyslack.model.entity.Chat;
import com.copyslack.copyslack.model.entity.Message;
import com.copyslack.copyslack.model.entity.User;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@RestController
@AllArgsConstructor
public class MessageControllerC implements MessageController{
    //поле - сервис сообщений

    @Override
    @PostMapping("/mes/{value}/{chat}/{author}/{createTime}")
    public Message addMes(@PathVariable String value,
                          @PathVariable Chat chat,
                          @PathVariable User author,
                          @PathVariable  Date createTime) {

        return null;
    }

    @GetMapping("/messages/a")
    @Override
    public List<Message> getByChat(@RequestBody Chat chat) {
        //сервис просто вызывает нужный метод из dao
        return null;
    }

    @Override
    @GetMapping("/messages/a/c")
    public List<Message> getByAuthorAndChat(@RequestBody User author, @RequestBody Chat chat) {
        //сервис просто вызывает нужный метод из dao
        return null;
    }

    @Override
    @GetMapping("/messages/val/{value}")
    public List<Message> getByValue(@PathVariable String value) {
        //сервис просто вызывает нужный метод из dao
        return null;
    }

    @Override
    @PutMapping("message/{value}/{uid}")
    public Message updateMes(@PathVariable String value,@PathVariable UUID uid) {
        return null;
    }

    @Override
    @DeleteMapping("message/{uid}")
    public Message deleteMes(@PathVariable UUID uid) {
        return null;
    }
}
