package com.masai.Usecase;

import java.util.Scanner;

import javax.persistence.EntityManager;

import com.masai.Utility.EMUtility;
import com.masai.entity.Employee;

public class AccessEmployeeIdToDepartment {

	public static void main(String[] args) {
		EntityManager em= EMUtility.provideEmEntityManager();
	 
		Scanner sc=new Scanner(System.in);
		System.out.println("Employee Employee Id");
		Integer empId= sc.nextInt();
		
		Employee emp =em.find(Employee.class, empId);
		if(emp!=null) {
		System.out.println("Employee Id     : "+emp.getEmpId());
		System.out.println("Employee Name   : "+emp.getEmpName());
		System.out.println("Employee Add    : "+emp.getEmpAddr());
		System.out.println("Employee Salary : "+emp.getSalary());
		System.out.println("Department Id   : "+emp.getDepartment().getDepId());
		System.out.println("Department Name : "+emp.getDepartment().getDepName());
		System.out.println("Department Add  : "+emp.getDepartment().getDepAdd());
		
		}
		else {
			
			System.out.println("Please Provide Valid Employee Id");
		}
	}
}

