package com.management.managementsystem.repositories;

import com.management.managementsystem.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
public interface UserRepository extends JpaRepository<User,String> {
    Optional<User> findByEmail(String email);
}
