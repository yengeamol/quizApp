package com.quizApp.amol.Service;

import java.util.List;

import com.quizApp.amol.Model.Exam.Question;
import com.quizApp.amol.Model.Exam.Quiz;

public interface questionService {

    public Question addQuestion(Question question);
    public Question updateQuestion(Long id,Question question) throws Exception;
    public List<Question> getAllQuestions();
    public Question getQuestionById(Long qId);
    public void deleteQuestion(Long qId);
    public List<Question> getQuestionsOfQuiz(Quiz quiz);
    public Question get(Long qid);



}
