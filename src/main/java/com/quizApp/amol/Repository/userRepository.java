package com.quizApp.amol.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quizApp.amol.Model.User;

import java.util.Optional;

@Repository
public interface userRepository extends JpaRepository<User,Long> {

    public User findByUsername(String username);
}
