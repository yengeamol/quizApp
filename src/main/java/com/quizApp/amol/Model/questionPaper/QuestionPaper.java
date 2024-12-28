package com.quizApp.amol.Model.questionPaper;



import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "questionPaper")
public class QuestionPaper {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long qid;
    private String collegeName;
    private String institutionName;
    private String department;
    private String examType;
    private String semester;
    private String test;
    private String subjectCode;
    private String faculty;
    private String time;
    private String note;
    private int maxMarks;
    private String co1,co2,co3,co4;

    @OneToMany(mappedBy = "questionPaper",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JsonIgnore
    private List<parentQuestion> questions=new ArrayList<>();

	public long getQid() {
		return qid;
	}

	public void setQid(long qid) {
		this.qid = qid;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getInstitutionName() {
		return institutionName;
	}

	public void setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getExamType() {
		return examType;
	}

	public void setExamType(String examType) {
		this.examType = examType;
	}

	public String getSemester() {
		return semester;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}

	public String getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public int getMaxMarks() {
		return maxMarks;
	}

	public void setMaxMarks(int maxMarks) {
		this.maxMarks = maxMarks;
	}

	public String getCo1() {
		return co1;
	}

	public void setCo1(String co1) {
		this.co1 = co1;
	}

	public String getCo2() {
		return co2;
	}

	public void setCo2(String co2) {
		this.co2 = co2;
	}

	public String getCo3() {
		return co3;
	}

	public void setCo3(String co3) {
		this.co3 = co3;
	}

	public String getCo4() {
		return co4;
	}

	public void setCo4(String co4) {
		this.co4 = co4;
	}

	public List<parentQuestion> getQuestions() {
		return questions;
	}

	public void setQuestions(List<parentQuestion> questions) {
		this.questions = questions;
	}

	public QuestionPaper(long qid, String collegeName, String institutionName, String department, String examType,
			String semester, String test, String subjectCode, String faculty, String time, String note, int maxMarks,
			String co1, String co2, String co3, String co4, List<parentQuestion> questions) {
		super();
		this.qid = qid;
		this.collegeName = collegeName;
		this.institutionName = institutionName;
		this.department = department;
		this.examType = examType;
		this.semester = semester;
		this.test = test;
		this.subjectCode = subjectCode;
		this.faculty = faculty;
		this.time = time;
		this.note = note;
		this.maxMarks = maxMarks;
		this.co1 = co1;
		this.co2 = co2;
		this.co3 = co3;
		this.co4 = co4;
		this.questions = questions;
	}

	public QuestionPaper() {
		super();
		// TODO Auto-generated constructor stub
	}

    
    
}
