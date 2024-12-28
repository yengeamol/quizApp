package com.quizApp.amol.Service;

import org.springframework.http.ResponseEntity;

import com.quizApp.amol.Model.Exam.Category;
import com.quizApp.amol.Model.Exam.Quiz;

import java.util.List;

public interface quizService {

    public Quiz addQuiz(Quiz quiz);
    public Quiz updateQuiz(Long id,Quiz quiz) throws Exception;
    public List<Quiz> getAllQuizzes();
    public void deleteQuiz(Long qid) throws Exception;
    public Quiz getQuizById(Long quizId);
    public List<Quiz> getQuizzesOfCategory(Category category);
    public List<Quiz> getActiveQuizzes();
    public List<Quiz> getActvieQuizzesOfCategory(Category category);
}
