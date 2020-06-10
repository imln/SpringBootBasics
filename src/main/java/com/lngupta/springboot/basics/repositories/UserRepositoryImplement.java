package com.lngupta.springboot.basics.repositories;


import com.lngupta.springboot.basics.models.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("inMemory")
public class UserRepositoryImplement implements UserRepository{
    private List<User> userDataBase = new ArrayList<>();

    @Override
    public User createUser(User user){
        User createdUser = new User(user.getName(),user.getGender());
        userDataBase.add(createdUser);
        return createdUser;
    }

    @Override
    public Optional<User> getUserById(UUID id) {
        return userDataBase
                .stream()
                .filter(
                        user -> user.getUuid().equals(id)
                )
                .findFirst();
    }
}
