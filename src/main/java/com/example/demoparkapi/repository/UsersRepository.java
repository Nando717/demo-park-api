package com.example.demoparkapi.repository;

import com.example.demoparkapi.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {
}