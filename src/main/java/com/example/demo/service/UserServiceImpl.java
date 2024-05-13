package com.example.demo.service;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import com.example.demo.UserRepository.java.UserRepository;
import com.example.demo.model.User;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User getUser(int id) {
        return userRepository.findById(id).orElse(null);
    }
}
