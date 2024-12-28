package com.quizApp.amol.Repository.questionPaper;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quizApp.amol.Model.questionPaper.QuestionPaper;
import com.quizApp.amol.Model.questionPaper.parentQuestion;

import java.util.List;

@Repository
public interface parentQuestionRepository extends JpaRepository<parentQuestion,Long> {

    public List<parentQuestion> findByQuestionPaper(QuestionPaper questionPaper);

}