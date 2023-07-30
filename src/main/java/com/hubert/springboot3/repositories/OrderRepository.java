package com.hubert.springboot3.repositories;

import com.hubert.springboot3.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
