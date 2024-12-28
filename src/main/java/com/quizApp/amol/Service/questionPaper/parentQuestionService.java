package com.quizApp.amol.Service.questionPaper;

import java.util.List;

import com.quizApp.amol.Model.questionPaper.QuestionPaper;
import com.quizApp.amol.Model.questionPaper.parentQuestion;

public interface parentQuestionService {

    public parentQuestion addQuestion(parentQuestion parentQuestion);
    public parentQuestion updateQuestion(Long id, parentQuestion parentQuestion) throws Exception;
    public List<parentQuestion> getAllQuestions();
    public parentQuestion getQuestionById(Long qId);
    public void deleteQuestion(Long qId);
    public List<parentQuestion> getQuestionsOfQuestionPaper(QuestionPaper questionPaper);

}