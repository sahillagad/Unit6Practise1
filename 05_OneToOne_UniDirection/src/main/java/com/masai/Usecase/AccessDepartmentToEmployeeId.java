package com.masai.Usecase;

import java.util.Scanner;

import javax.persistence.EntityManager;

import com.masai.Utility.EMUtility;
import com.masai.entity.Department;
import com.masai.entity.Employee;

public class AccessDepartmentToEmployeeId {

	public static void main(String[] args) {
		EntityManager em= EMUtility.provideEmEntityManager();
	 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Department Id");
		Integer depId= sc.nextInt();
		
		Department dep =em.find(Department.class, depId);
		
	
		if(dep!=null) {

			System.out.println("Department Id   : "+dep.getDepId());
			System.out.println("Department Name : "+dep.getDepName());
			System.out.println("Department Add  : "+dep.getDepAdd());
			

		
		}
		else {
			
			System.out.println("Please Provide Valid Department Id");
		}
	}
}
