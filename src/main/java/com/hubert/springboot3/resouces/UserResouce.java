package com.hubert.springboot3.resouces;

import com.hubert.springboot3.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResouce {
    public ResponseEntity<User> findAll(){

        User u = new User(1L, "Mary", "mary@gmail.com", "9999999999","12345");
        return ResponseEntity.ok().body(u);
    }
}
