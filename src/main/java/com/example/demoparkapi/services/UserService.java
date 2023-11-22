package com.example.demoparkapi.services;

import com.example.demoparkapi.entity.User;
import com.example.demoparkapi.repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UsersRepository usersRepository;

@Transactional
    public User salvar(User user) {
    return usersRepository.save(user);
    }


@Transactional(readOnly = true)
    public User searchByID(Long id) {
    return usersRepository.findById(id).orElseThrow(
            () -> new RuntimeException("Usuário não encontrado")
    );
    }
}


    