package com.hubert.springboot3.repositories;

import com.hubert.springboot3.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
