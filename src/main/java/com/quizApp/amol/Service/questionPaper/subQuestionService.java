package com.quizApp.amol.Service.questionPaper;

import java.util.List;

import com.quizApp.amol.Model.questionPaper.parentQuestion;
import com.quizApp.amol.Model.questionPaper.subQuestion;

public interface subQuestionService {

   public subQuestion addSubQuestion(subQuestion subQuestion);
   public subQuestion updateSubQuestion(Long id, subQuestion subQuestion) throws Exception;
   public List<subQuestion> getAllSubQuestions();
   public subQuestion getSubQuestionById(Long subQId);
   public void deleteSubQuestion(Long subQId);
   public List<subQuestion> getSubQuestionsOfParentQuestion(parentQuestion parentQuestion);

}
