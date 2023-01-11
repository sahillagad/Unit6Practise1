package com.masai.Usecase;

import java.util.Scanner;

import javax.persistence.EntityManager;

import com.masai.Dao.CustomerDao;
import com.masai.Dao.CustomerDaoImpl;
import com.masai.Entity.Address;
import com.masai.Entity.Customer;
import com.masai.Utility.EMUtility;

public class AddCustomer {

	public static void main(String[] args) {
		

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Customer Name");
		String name= sc.next();
		
		System.out.println("Enter Mobile Number");
	    String mobileNumber=sc.next();
		
		System.out.println("Enter Email Address");
		  String email=sc.next();
		
		
		  
		System.out.println("You Want To Add Address(Y/N)");
		String result=sc.next();
		
		
		Customer customer=new Customer();
		customer.setName(name);
		customer.setMobileName(mobileNumber);
		customer.setEmail(email);
		
		
		
		while(result.equalsIgnoreCase("Y")) {
			
			
			System.out.println("Enter State ");
			String state= sc.next();
			
			System.out.println("Enter City");
			String City= sc.next();
			
			System.out.println("Enter Pincode");
			String Pincode= sc.next();
			
			System.out.println("Enter Type");
			String Type= sc.next();
			
			
			Address address=new Address(state, City, Pincode, Type);
			customer.getAddresses().add(address);
			
            
			System.out.println("You Want Add More Address(Y/N)");
			String ans= sc.next();
		 
			if(ans.equalsIgnoreCase("N")) {
				break;
			}
			
		
		}
		
		

		CustomerDao dao=new CustomerDaoImpl();
		String s= dao.registeredCustomer(customer);
         System.out.println(s); 
	}
}
