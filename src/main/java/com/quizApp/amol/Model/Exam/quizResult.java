package com.quizApp.amol.Model.Exam;


import jakarta.persistence.*;

@Entity
public class quizResult {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    private String username;
    private int marksGot;
    private int attempted;
    private int correctAnswers;

    @ManyToOne(fetch = FetchType.EAGER)
    private Quiz quiz;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getMarksGot() {
		return marksGot;
	}

	public void setMarksGot(int marksGot) {
		this.marksGot = marksGot;
	}

	public int getAttempted() {
		return attempted;
	}

	public void setAttempted(int attempted) {
		this.attempted = attempted;
	}

	public int getCorrectAnswers() {
		return correctAnswers;
	}

	public void setCorrectAnswers(int correctAnswers) {
		this.correctAnswers = correctAnswers;
	}

	public Quiz getQuiz() {
		return quiz;
	}

	public void setQuiz(Quiz quiz) {
		this.quiz = quiz;
	}

	public quizResult(int id, String username, int marksGot, int attempted, int correctAnswers, Quiz quiz) {
		super();
		this.id = id;
		this.username = username;
		this.marksGot = marksGot;
		this.attempted = attempted;
		this.correctAnswers = correctAnswers;
		this.quiz = quiz;
	}

	public quizResult() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    

}
