package com.quizApp.amol.Service.questionPaper;

import java.util.List;

import com.quizApp.amol.Model.questionPaper.QuestionPaper;

public interface questionPaperService {
    public QuestionPaper addQuestionPaper(QuestionPaper questionPaper);
    public QuestionPaper updateQuestionPaper(Long id,QuestionPaper questionPaper) throws Exception;
    public List<QuestionPaper> getAllQuestionPapers();
    public void deleteQuestionPaper(Long qid) throws Exception;
    public QuestionPaper getQuestionPaperById(Long quizId);

}
