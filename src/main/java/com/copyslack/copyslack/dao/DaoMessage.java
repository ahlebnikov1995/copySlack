package com.copyslack.copyslack.dao;


import com.copyslack.copyslack.model.entity.Chat;
import com.copyslack.copyslack.model.entity.Message;
import com.copyslack.copyslack.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface DaoMessage extends JpaRepository<Message, UUID> {
    List<Message> findByChat(Chat chat);
    List<Message> findByChatAndAuthor(Chat chat, User author);
    List<Message> findByText(String text);
    void deleteByUid(UUID uid);

}
