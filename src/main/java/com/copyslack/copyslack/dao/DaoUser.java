package com.copyslack.copyslack.dao;


import com.copyslack.copyslack.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DaoUser extends JpaRepository<User, Long> {

    Optional<User> findById(Long id);

    void deleteById(Long id);



}
