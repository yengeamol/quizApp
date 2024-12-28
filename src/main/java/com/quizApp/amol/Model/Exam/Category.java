package com.quizApp.amol.Model.Exam;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long cid;

    private String title;

    private String description;

    @OneToMany(mappedBy = "category",cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Quiz> quizzes=new LinkedHashSet<>();

	public long getCid() {
		return cid;
	}

	public void setCid(long cid) {
		this.cid = cid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Quiz> getQuizzes() {
		return quizzes;
	}

	public void setQuizzes(Set<Quiz> quizzes) {
		this.quizzes = quizzes;
	}

	public Category(long cid, String title, String description, Set<Quiz> quizzes) {
		super();
		this.cid = cid;
		this.title = title;
		this.description = description;
		this.quizzes = quizzes;
	}

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    

}
