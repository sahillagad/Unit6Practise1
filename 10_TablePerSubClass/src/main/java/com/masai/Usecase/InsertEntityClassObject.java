package com.masai.Usecase;

import javax.persistence.EntityManager;

import com.masai.Entity.ContractualEmployee;
import com.masai.Entity.Employee;
import com.masai.Entity.SalaryEmployee;
import com.masai.Utility.EMUtility;

public class InsertEntityClassObject {

	
	public static void main(String[] args) {
		
		EntityManager em= EMUtility.provideEmEntityManager();
		
		
		
		
	   Employee employee=new Employee("Ram");
	   ContractualEmployee contractualEmployee=new ContractualEmployee("Raj", 21, 500);
	   SalaryEmployee salaryEmployee=new SalaryEmployee("Tom",50000);
	   
	  em.getTransaction().begin();
	   
		
	  em.persist(salaryEmployee);

	  em.persist(contractualEmployee);

	  em.persist(employee);
	  
	  
	  
	  em.getTransaction().commit();
		em.close();
		
		
		
		
	}
}
