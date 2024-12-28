package com.quizApp.amol.Impl;


import com.quizApp.amol.Model.Exam.Quiz;
import com.quizApp.amol.Model.Exam.quizResult;
import com.quizApp.amol.Repository.quizResultRepository;
import com.quizApp.amol.Service.quizResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class quizResultServiceImpl implements quizResultService {

    @Autowired
    private quizResultRepository quizResultRepository;


    @Override
    public List<quizResult> getAllQuizResults() {
        return quizResultRepository.findAll();
    }

    @Override
    public List<quizResult> getQuizResultsOfQuiz(Quiz quiz) {
        return quizResultRepository.findByQuiz(quiz);
    }

    @Override
    public quizResult saveQuizResult(quizResult quizResult) {
        return quizResultRepository.save(quizResult);
    }

    @Override
    public void deleteQuizResult(int id) {
        quizResult quizResult=new quizResult();
        quizResult.setId(id);
        this.quizResultRepository.delete(quizResult);
    }

    @Override
    public Optional<quizResult> getQuizResultByUsernameAndQuiz(String username, Quiz quiz) {
        return quizResultRepository.findByQuizAndUsername(quiz, username);
    }


}
