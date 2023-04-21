package com.example.demo.entity;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="DemoStudentFee")


public class StudentEntity {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id;
	
	private String Studentname;
	 
	private Integer Studentid;
	
	private Integer DOJ;
	
	private String Teachername;
	
	private Integer Fees;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	
	public String getStudentname() {
		return Studentname;
	}

	public void setStudentname(String studentname) {
		Studentname = studentname;
	}

	public Integer getStudentid() {
		return Studentid;
	}

	public void setStudentid(Integer studentid) {
		Studentid = studentid;
	}

	public Integer getDOJ() {
		return DOJ;
	}

	public void setDOJ(Integer dOJ) {
		DOJ = dOJ;
	}

	public String getTeachername() {
		return Teachername;
	}

	public void setTeachername(String teachername) {
		Teachername = teachername;
	}

	public Integer getFees() {
		return Fees;
	}

	public void setFees(Integer fees) {
		Fees = fees;
	}
	
			
	

}
