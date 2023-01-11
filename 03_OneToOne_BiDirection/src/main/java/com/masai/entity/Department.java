package com.masai.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Department {

	
	 @Id 
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Integer depId;
	 private String depName;
	 private String depAdd;

	 
	 @OneToOne(cascade =CascadeType.ALL)
	 private Employee employee;


	public Department(Integer depId, String depName, String depAdd, Employee employee) {
		super();
		this.depId = depId;
		this.depName = depName;
		this.depAdd = depAdd;
		this.employee = employee;
	}


	public Department(String depName, String depAdd) {
		super();
		this.depName = depName;
		this.depAdd = depAdd;
	}


	public Department(String depName, String depAdd, Employee employee) {
		super();
		this.depName = depName;
		this.depAdd = depAdd;
		this.employee = employee;
	}


	public Department() {
		super();
	}


	public Integer getDepId() {
		return depId;
	}


	public void setDepId(Integer depId) {
		this.depId = depId;
	}


	public String getDepName() {
		return depName;
	}


	public void setDepName(String depName) {
		this.depName = depName;
	}


	public String getDepAdd() {
		return depAdd;
	}


	public void setDepAdd(String depAdd) {
		this.depAdd = depAdd;
	}


	public Employee getEmployee() {
		return employee;
	}


	public void setEmployee(Employee employee) {
		this.employee = employee;
	}


	@Override
	public String toString() {
		return "Department [depId=" + depId + ", depName=" + depName + ", depAdd=" + depAdd + ", employee=" + employee
				+ "]";
	}
	 
	 
	 
	 
}
