package com.masai.Entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer StudentRoll;
	private String studentName;
	private String mobileNumber;
	private String email;

	@ManyToOne(fetch = FetchType.EAGER)
	private Collage collage;

	public Student(Integer studentRoll, String studentName, String mobileNumber, String email, Collage collage) {
		super();
		StudentRoll = studentRoll;
		this.studentName = studentName;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.collage = collage;
	}

	public Student(String studentName, String mobileNumber, String email) {
		super();
		this.studentName = studentName;
		this.mobileNumber = mobileNumber;
		this.email = email;
	}

	public Student(String studentName, String mobileNumber, String email, Collage collage) {
		super();
		this.studentName = studentName;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.collage = collage;
	}

	public Student() {
		super();
	}

	public Integer getStudentRoll() {
		return StudentRoll;
	}

	public void setStudentRoll(Integer studentRoll) {
		StudentRoll = studentRoll;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Collage getCollage() {
		return collage;
	}

	public void setCollage(Collage collage) {
		this.collage = collage;
	}

	@Override
	public String toString() {
		return "Student [StudentRoll=" + StudentRoll + ", studentName=" + studentName + ", mobileNumber=" + mobileNumber
				+ ", email=" + email + ", collage=" + collage + "]";
	}

 
	
	
	
	
	
	
	
	
	
	
}
