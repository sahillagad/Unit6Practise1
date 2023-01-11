package com.masai.Usecase;

import java.util.List;
import java.util.Scanner;

import com.masai.Dao.CustomerDao;
import com.masai.Dao.CustomerDaoImpl;
import com.masai.Entity.Address;
import com.masai.Entity.Customer;

public class getCustomerById {

	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Customer Id");
		Integer cid= sc.nextInt();
		
		CustomerDao customerDao=new CustomerDaoImpl();
	     Customer  customer= customerDao.getCustomerById(cid);
	    
	     System.out.println("Name          : "+customer.getName());
	     System.out.println("mobile Number : "+customer.getMobileName());
	     System.out.println("email         : "+customer.getEmail());
	     System.out.println("--------------Address Details------------------");
		for(Address address:customer.getAddresses()) {
			
			System.out.println("state   "+address.getState());
			System.out.println("city    "+address.getCity());
			System.out.println("pincode "+address.getPincode());
			System.out.println("--------------------------------");
		}
	}
	
}
