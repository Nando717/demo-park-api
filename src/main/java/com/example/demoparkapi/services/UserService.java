package com.example.demoparkapi.services;

import com.example.demoparkapi.entity.Users;
import com.example.demoparkapi.repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UsersRepository usersRepository;

@Transactional
    public Users salvar(Users users) {
        return usersRepository.save(users);
    }
}
