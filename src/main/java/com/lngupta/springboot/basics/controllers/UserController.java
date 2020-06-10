package com.lngupta.springboot.basics.controllers;


import com.lngupta.springboot.basics.dto.ResponseDTO;
import com.lngupta.springboot.basics.models.User;
import com.lngupta.springboot.basics.services.UserService;
import com.lngupta.springboot.basics.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping(Constants.USER_END_POINT)
public class UserController {

    private UserService userService;

    @Autowired
    UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @GetMapping("/{id}")
    public ResponseDTO<User> getUser(@PathVariable(name = "id") UUID id ){
        User respondUser = userService.getUser(id);
        if(respondUser == null){
            return new ResponseDTO(HttpStatus.NOT_FOUND,null );
        }
        return new ResponseDTO(HttpStatus.FOUND,respondUser);
    }

}
