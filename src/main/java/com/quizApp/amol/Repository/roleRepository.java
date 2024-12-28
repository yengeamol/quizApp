package com.quizApp.amol.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quizApp.amol.Model.Role;

public interface roleRepository extends JpaRepository<Role,Long> {
}
