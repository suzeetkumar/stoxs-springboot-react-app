package com.StoxManager.StoxsSense.controller;

import com.StoxManager.StoxsSense.model.Users;
import com.StoxManager.StoxsSense.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {
     @Autowired
    private UserRepository userRepository;
    @PostMapping("/signUp")
    public ResponseEntity<Users> saveAuth(@RequestBody Users user){
        Users newUser= new Users();

        newUser.setUserName(user.getUserName());
        newUser.setEmail(user.getEmail());
        newUser.setPassword(user.getPassword());
        Users savedUser= userRepository.save(newUser);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);
    }

}
