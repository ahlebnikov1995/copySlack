package com.copyslack.copyslack.controllers;


import com.copyslack.copyslack.model.entity.Chat;
import com.copyslack.copyslack.model.entity.User;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class UserControllerC implements UserController{

    //поля - сервис для юзеров и сервис для чатов

    @Override
    @PostMapping("/user")
    public User addUser(@RequestBody User user) { //подавать без id и с пустым списком чатов
        return null;
    }

    @Override
    @GetMapping("/users")
    public List<User> getByChat(@RequestBody Chat chat) {
        //сервисом забирается чат из базы, далее возвращается его поле юзеров
        return null;
    }

    @Override
    @GetMapping("/user/{id}")
    public User getUser(@PathVariable Long id) {
        return null;
    }

    @Override
    @PutMapping("/user/{name}/{id}")
    public User updateUser(@PathVariable String name,@PathVariable Long id) {
        return null;
    }

    @Override
    @PutMapping("/user/{id}")
    public User addChat(@RequestBody Chat chat, @PathVariable Long id) {
        //делать в сервисе через метод из модели
        return null;
    }

    @Override
    @DeleteMapping("/user/{id}")
    public User delete(@PathVariable Long id) {
        return null;
    }
}
