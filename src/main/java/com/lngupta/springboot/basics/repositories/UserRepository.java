package com.lngupta.springboot.basics.repositories;

import com.lngupta.springboot.basics.models.User;

import java.util.Optional;
import java.util.UUID;
public interface UserRepository {
    User createUser(User user);
    Optional<User> getUserById(UUID id);
}
