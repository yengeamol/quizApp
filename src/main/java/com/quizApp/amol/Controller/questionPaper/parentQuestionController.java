package com.quizApp.amol.Controller.questionPaper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.quizApp.amol.Model.questionPaper.QuestionPaper;
import com.quizApp.amol.Model.questionPaper.parentQuestion;
import com.quizApp.amol.Service.questionPaper.parentQuestionService;

import java.util.List;

@RestController
@RequestMapping("/questions")
@CrossOrigin(origins = "http://localhost:4200")
public class parentQuestionController {

    @Autowired
    private parentQuestionService parentQuestionService;

    @PostMapping("/add")
    public parentQuestion addQuestion(@RequestBody parentQuestion parentQuestion) {
        return parentQuestionService.addQuestion(parentQuestion);
    }

    @PutMapping("/update/{id}")
    public parentQuestion updateQuestion(@PathVariable("id") Long id, @RequestBody parentQuestion parentQuestion) throws Exception {
        return parentQuestionService.updateQuestion(id, parentQuestion);
    }

    @GetMapping("/getAll")
    public List<parentQuestion> getAllQuestions() {
        return parentQuestionService.getAllQuestions();
    }

    @GetMapping("/{qId}")
    public parentQuestion getQuestionById(@PathVariable("qId") Long qId) {
        return parentQuestionService.getQuestionById(qId);
    }

    @DeleteMapping("/delete/{qId}")
    public void deleteQuestion(@PathVariable("qId") Long qId) {
        parentQuestionService.deleteQuestion(qId);
    }

    @GetMapping("/getByQuestionPaper/{qid}")
    public List<parentQuestion> getQuestionsOfQuestionPaper(@PathVariable Long qid) {
        QuestionPaper questionPaper = new QuestionPaper();
        questionPaper.setQid(qid);
        return parentQuestionService.getQuestionsOfQuestionPaper(questionPaper);
    }
}
