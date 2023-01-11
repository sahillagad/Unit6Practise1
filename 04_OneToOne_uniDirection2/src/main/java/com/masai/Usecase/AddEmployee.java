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
	
		
		
		Employee employee2=new Employee("Raj", "Pune", 45000);
		Department department2=new Department("Sales", "Pune", employee2);
		
		
		
		Employee employee3=new Employee("Tom", "Nashik", 50000);
		Department department3=new Department("Purchase", "Nashik", employee3);
		
		
		
		Employee employee4=new Employee("Sahil", "Kalyan", 55000);
		Department department4=new Department("IT", "Kalyan", employee4);
		
	 EntityManager em=EMUtility.provideEmEntityManager();
	 em.getTransaction().begin();
		
		 
		
		em.persist(department);
		em.persist(department2);
		em.persist(department3);
		em.persist(department4);
		
				
	
	 em.getTransaction().commit();
	em.close();	
		
	 
		
		
		
		
		
		
	}
}
