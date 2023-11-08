package com.example.demoparkapi.services;

import com.example.demoparkapi.repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UsersRepository usersRepository;


}
