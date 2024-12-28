package com.quizApp.amol.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quizApp.amol.Model.Exam.Quiz;
import com.quizApp.amol.Model.Exam.quizResult;

import java.util.List;
import java.util.Optional;

@Repository
public interface quizResultRepository extends JpaRepository<quizResult,Integer> {
    List<quizResult> findByQuiz(Quiz quiz);
    Optional<quizResult> findByQuizAndUsername(Quiz quiz, String username);
}
