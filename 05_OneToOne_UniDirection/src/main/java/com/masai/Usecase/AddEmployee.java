package com.masai.Usecase;

import javax.persistence.EntityManager;

import com.masai.Utility.EMUtility;
import com.masai.entity.Department;
import com.masai.entity.Employee;

public class AddEmployee {

	public static void main(String[] args) {
		
		
		
		Department department=new Department("HR", "Mumbai");
		Employee employee=new Employee("Ram", "Mumbai", 70000,department);
		
		
	
		
		
		
		Department department2=new Department("Sales", "Pune");
		Employee employee2=new Employee("Raj", "Pune", 45000,department2);
		
		
		
		Department department3=new Department("Purchase", "Nashik");
		Employee employee3=new Employee("Tom", "Nashik", 50000,department3);		
		
		
		Department department4=new Department("IT", "Kalyan");
		Employee employee4=new Employee("Sahil", "Kalyan", 55000,department4);
		
		
		
		
		
		
	 EntityManager em=EMUtility.provideEmEntityManager();
	 em.getTransaction().begin();
		
		 
	 em.persist(employee);
	 em.persist(employee2);
	 em.persist(employee3);
	 em.persist(employee4);
	
				
	
	 em.getTransaction().commit();
	em.close();	
		
	 
		
		
		
		
		
		
	}
}
