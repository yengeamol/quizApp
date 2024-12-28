package com.quizApp.amol.Service;


import java.util.List;
import java.util.Optional;

import com.quizApp.amol.Model.Exam.Quiz;
import com.quizApp.amol.Model.Exam.quizResult;

public interface quizResultService {
    List<quizResult> getAllQuizResults();
    List<quizResult> getQuizResultsOfQuiz(Quiz quiz);
    quizResult saveQuizResult(quizResult quizResult);
    void deleteQuizResult(int id);
    Optional<quizResult> getQuizResultByUsernameAndQuiz(String username, Quiz quiz);
}
