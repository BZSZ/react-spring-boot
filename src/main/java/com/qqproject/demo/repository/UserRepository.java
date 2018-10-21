package com.qqproject.demo.repository;

import com.qqproject.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
//    User findByUserName(String userName);
}
