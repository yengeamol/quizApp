package com.quizApp.amol.Controller.questionPaper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.quizApp.amol.Model.questionPaper.QuestionPaper;
import com.quizApp.amol.Service.questionPaper.questionPaperService;

import java.util.List;

@RestController
@RequestMapping("/questionPaper")
@CrossOrigin(origins = "http://localhost:4200")
public class questionPaperController {

    @Autowired
    private questionPaperService questionPaperService;

    @PostMapping("/add")
    public QuestionPaper addQuestionPaper(@RequestBody QuestionPaper questionPaper) {
        return questionPaperService.addQuestionPaper(questionPaper);
    }

    @PutMapping("/update/{id}")
    public QuestionPaper updateQuestionPaper(@PathVariable("id") Long id, @RequestBody QuestionPaper questionPaper) throws Exception {
        return questionPaperService.updateQuestionPaper(id, questionPaper);
    }

    @GetMapping("/getAll")
    public List<QuestionPaper> getAllQuestionPapers() {
        return questionPaperService.getAllQuestionPapers();
    }

    @DeleteMapping("/delete/{qid}")
    public void deleteQuestionPaper(@PathVariable("qid") Long qid) throws Exception {
        questionPaperService.deleteQuestionPaper(qid);
    }

    @GetMapping("/{quizId}")
    public QuestionPaper getQuestionPaperById(@PathVariable("quizId") Long quizId) {
        return questionPaperService.getQuestionPaperById(quizId);
    }
}
