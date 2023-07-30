package com.hubert.springboot3.services;

import com.hubert.springboot3.entities.Order;
import com.hubert.springboot3.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;

    public List<Order> findAll(){
        return repository.findAll();
    }

    public Order findById(Long id){
        try {
            Optional<Order> obj = repository.findById(id);
            return obj.get();
        }
        catch (NoSuchElementException e){
            e.printStackTrace();
            return null;
        }
    }
}
