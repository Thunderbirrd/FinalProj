package com.example.base.services;


import com.example.base.models.User;
import com.example.base.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    @Transactional
    public User getUser(Integer id){
        return userRepo.findById(id).orElse(null);
    }
}
