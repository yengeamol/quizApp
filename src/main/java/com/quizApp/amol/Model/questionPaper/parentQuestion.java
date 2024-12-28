package com.quizApp.amol.Model.questionPaper;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;


import java.util.ArrayList;
import java.util.List;

@Entity
public class parentQuestion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long qid;
    private int marks;
    private String co;
    private String btl;
    private String questionContent;

    @ManyToOne(fetch = FetchType.EAGER)
    private QuestionPaper questionPaper;


    @OneToMany(mappedBy = "parentQuestion",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JsonIgnore
    private List<subQuestion> subQuestions=new ArrayList<>();


	public long getQid() {
		return qid;
	}


	public void setQid(long qid) {
		this.qid = qid;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}


	public String getCo() {
		return co;
	}


	public void setCo(String co) {
		this.co = co;
	}


	public String getBtl() {
		return btl;
	}


	public void setBtl(String btl) {
		this.btl = btl;
	}


	public String getQuestionContent() {
		return questionContent;
	}


	public void setQuestionContent(String questionContent) {
		this.questionContent = questionContent;
	}


	public QuestionPaper getQuestionPaper() {
		return questionPaper;
	}


	public void setQuestionPaper(QuestionPaper questionPaper) {
		this.questionPaper = questionPaper;
	}


	public List<subQuestion> getSubQuestions() {
		return subQuestions;
	}


	public void setSubQuestions(List<subQuestion> subQuestions) {
		this.subQuestions = subQuestions;
	}


	public parentQuestion(long qid, int marks, String co, String btl, String questionContent,
			QuestionPaper questionPaper, List<subQuestion> subQuestions) {
		super();
		this.qid = qid;
		this.marks = marks;
		this.co = co;
		this.btl = btl;
		this.questionContent = questionContent;
		this.questionPaper = questionPaper;
		this.subQuestions = subQuestions;
	}


	public parentQuestion() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    

}