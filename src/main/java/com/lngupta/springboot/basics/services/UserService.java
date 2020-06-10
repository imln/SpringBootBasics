package com.lngupta.springboot.basics.services;


import com.lngupta.springboot.basics.models.User;
import com.lngupta.springboot.basics.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {


    private UserRepository userRepository;

    public UserService(@Qualifier("inMemory") UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user){
        return userRepository.createUser(user);
    }

    public User getUser(UUID id){
        Optional<User> foundUser = userRepository.getUserById(id);
        if(foundUser.isEmpty()){
            return null;
        }
        return foundUser.get();
    }
}
