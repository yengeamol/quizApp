package com.quizApp.amol.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quizApp.amol.Model.Exam.Question;
import com.quizApp.amol.Model.Exam.Quiz;

import java.util.List;

public interface questionRepository extends JpaRepository<Question,Long> {
    List<Question> findByQuiz(Quiz quiz);
}
