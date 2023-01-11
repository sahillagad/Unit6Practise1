package com.masai.Usecase;

import java.util.List;
import java.util.Scanner;

import com.masai.Dao.CustomerDao;
import com.masai.Dao.CustomerDaoImpl;
import com.masai.Entity.Address;

public class AddAddressToCustomer {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
	
		
			System.out.println("Enter Customer Id");
			Integer cid= sc.nextInt();	
				
			System.out.println("Enter State ");
			String state= sc.next();
			
			System.out.println("Enter City");
			String City= sc.next();
			
			System.out.println("Enter Pincode");
			String Pincode= sc.next();
			
			System.out.println("Enter Type");
			String Type= sc.next();
			
			
			Address address=new Address(state, City, Pincode, Type);
		
			
			CustomerDao dao=new CustomerDaoImpl();
		 String s=dao.AddAddressToCustomer(cid, address);
		System.out.println(s);
		 
		
	}

}
