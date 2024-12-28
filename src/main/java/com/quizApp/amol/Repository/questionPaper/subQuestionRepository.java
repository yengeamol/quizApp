package com.quizApp.amol.Repository.questionPaper;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quizApp.amol.Model.questionPaper.parentQuestion;
import com.quizApp.amol.Model.questionPaper.subQuestion;

import java.util.List;

@Repository
public interface subQuestionRepository extends JpaRepository<subQuestion, Long> {

    public List<subQuestion> findByParentQuestion(parentQuestion parentQuestion);
}
