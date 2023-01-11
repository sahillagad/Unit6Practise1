package com.masai.Usecase;

import javax.persistence.EntityManager;

import com.masai.Utility.EMUtility;
import com.masai.entity.Department;
import com.masai.entity.Employee;

public class AddEmployee {

	public static void main(String[] args) {
		
		
		Department department=new Department("HR", "Mumbai");
		Employee employee=new Employee("Ram", "Mumbai", 70000);
		
		department.setEmployee(employee);
		employee.setDepartment(department);
		
		
		
		
	 EntityManager em=EMUtility.provideEmEntityManager();
	 em.getTransaction().begin();
		
		 
		
		em.persist(department);
		
				
	
	 em.getTransaction().commit();
	em.close();	
		
	 
		
		
		
		
		
		
	}
}
