package com.masai.Dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.masai.Entity.Address;
import com.masai.Entity.Customer;
import com.masai.Utility.EMUtility;

public class CustomerDaoImpl implements CustomerDao{

	@Override
	public String registeredCustomer(Customer customer) {
		String result="Customer Is Not Registered..";
		EntityManager em= EMUtility.provideEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(customer);
		result="Customer Is Registered Successfully..";
		
		em.getTransaction().commit();
		em.close();
		return result;
	}

	@Override
	public Customer getCustomerById(Integer cid) {
		EntityManager em= EMUtility.provideEntityManager();
		
		Customer customer=em.find(Customer.class, cid);
		
		if(customer==null) {
			
			RuntimeException exception=new RuntimeException("Please Provide The Correct Customer Id");
			throw exception;
		}
		
	
		
		return customer;
	}

	@Override
	public List<Address> getCustomeAddressrById(Integer cid) {
	EntityManager em= EMUtility.provideEntityManager();
		
		Customer customer=em.find(Customer.class, cid);
		
		if(customer==null) {
			
			RuntimeException exception=new RuntimeException("Please Provide The Correct Customer Id");
			throw exception;
		}
		
	
		
		return customer.getAddresses();
	}

	@Override
	public String AddAddressToCustomer(Integer cid, Address address) {
	   String result="Address Is Not Added";
		EntityManager em= EMUtility.provideEntityManager();
		
		Customer customer=em.find(Customer.class, cid);
		
		if(customer==null) {
			
			RuntimeException exception=new RuntimeException("Please Provide The Correct Customer Id");
			throw exception;
		}
		else {
			em.getTransaction().begin();
			
			customer.getAddresses().add(address);
			
			
			result="Address Is Added Successfully..";
	
			em.getTransaction().commit();
			em.close();
			
		}
		
		
		
		return result; 
	}
	
  
}
