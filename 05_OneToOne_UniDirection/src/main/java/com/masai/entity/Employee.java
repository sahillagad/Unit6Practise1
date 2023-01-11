package com.masai.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Employee {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer empId;
	private String empName;
	private String empAddr; 
	private Integer salary;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Department department;

	public Employee(Integer empId, String empName, String empAddr, Integer salary, Department department) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAddr = empAddr;
		this.salary = salary;
		this.department = department;
	}

	public Employee(String empName, String empAddr, Integer salary) {
		super();
		this.empName = empName;
		this.empAddr = empAddr;
		this.salary = salary;
	}

	public Employee(String empName, String empAddr, Integer salary, Department department) {
		super();
		this.empName = empName;
		this.empAddr = empAddr;
		this.salary = salary;
		this.department = department;
	}

	public Employee() {
		super();
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpAddr() {
		return empAddr;
	}

	public void setEmpAddr(String empAddr) {
		this.empAddr = empAddr;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAddr=" + empAddr + ", salary=" + salary
				+ ", department=" + department + "]";
	}
	
	
	
}
