package com.quizApp.amol.Repository.questionPaper;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quizApp.amol.Model.questionPaper.QuestionPaper;

@Repository
public interface questionPaperRepository extends JpaRepository<QuestionPaper,Long> {
}
