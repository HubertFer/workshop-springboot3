package com.hubert.springboot3.services;

import com.hubert.springboot3.entities.User;
import com.hubert.springboot3.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public List<User> findAll(){
        return repository.findAll();
    }

    public User findById(Long id){
        try {
            Optional<User> obj = repository.findById(id);
            return obj.get();
        }
        catch (NoSuchElementException e){
            e.printStackTrace();
            return null;
        }
    }
}
