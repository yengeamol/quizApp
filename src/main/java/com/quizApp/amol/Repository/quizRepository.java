package com.quizApp.amol.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quizApp.amol.Model.Exam.Category;
import com.quizApp.amol.Model.Exam.Quiz;

import java.util.List;


public interface quizRepository extends JpaRepository<Quiz,Long> {

    public List<Quiz> findBycategory(Category category);
    public List<Quiz> findByActive(Boolean active);
    public List<Quiz> findByCategoryAndActive(Category category,Boolean active);
}
