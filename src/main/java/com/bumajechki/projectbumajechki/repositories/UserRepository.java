package com.bumajechki.projectbumajechki.repositories;

import com.bumajechki.projectbumajechki.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
