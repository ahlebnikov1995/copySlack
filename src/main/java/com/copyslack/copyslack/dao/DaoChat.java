package com.copyslack.copyslack.dao;


import com.copyslack.copyslack.model.entity.Chat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DaoChat extends JpaRepository<Chat,Long> {
    Optional<Chat> findById(Long id);
    void deleteById(Long id);
}
