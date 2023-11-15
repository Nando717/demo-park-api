package com.example.demoparkapi.repository;

import com.example.demoparkapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<User, Long> {
}