package com.example.base.services;


import com.example.base.models.User;
import com.example.base.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

// Сервеис - подушка между репозиторием и контроллером

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    @Transactional(readOnly = true)
    public User getUser(Integer id){
        return userRepo.findById(id).orElse(null);
    }

    @Transactional
    public User saveUser(User user){
        userRepo.save(user);
        return userRepo.findById(user.getId()).orElse(null);
    }

    @Transactional
    public User findUserByLogin(String login){
        return userRepo.findUserByLogin(login);
    }
}
