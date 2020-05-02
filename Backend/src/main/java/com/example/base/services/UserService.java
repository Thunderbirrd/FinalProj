package com.example.base.services;


import com.example.base.models.User;
import com.example.base.repos.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepo userRepo;

    public User getUser(Integer id){
        return userRepo.findById(id).get();
    }
}
