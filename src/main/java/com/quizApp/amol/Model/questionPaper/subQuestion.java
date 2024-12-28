package com.quizApp.amol.Model.questionPaper;


import jakarta.persistence.*;

@Entity
public class subQuestion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long qid;
    private int marks;
    private String co;
    private String btl;
    private String questionContent;

    @ManyToOne(fetch = FetchType.EAGER)
    private parentQuestion parentQuestion;

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

	public parentQuestion getParentQuestion() {
		return parentQuestion;
	}

	public void setParentQuestion(parentQuestion parentQuestion) {
		this.parentQuestion = parentQuestion;
	}

	public subQuestion(long qid, int marks, String co, String btl, String questionContent,
			com.quizApp.amol.Model.questionPaper.parentQuestion parentQuestion) {
		super();
		this.qid = qid;
		this.marks = marks;
		this.co = co;
		this.btl = btl;
		this.questionContent = questionContent;
		this.parentQuestion = parentQuestion;
	}

	public subQuestion() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
	
	
}
