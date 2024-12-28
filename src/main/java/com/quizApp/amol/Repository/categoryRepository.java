package com.quizApp.amol.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quizApp.amol.Model.Exam.Category;

public interface categoryRepository extends JpaRepository<Category,Long> {

}
