package com.masai.Usecase;

import java.util.List;
import java.util.Scanner;

import com.masai.Dao.CustomerDao;
import com.masai.Dao.CustomerDaoImpl;
import com.masai.Entity.Address;

public class GetCustomeAddressrByIdUseacase {

	
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Customer Id");
		Integer cid= sc.nextInt();
		
		CustomerDao customerDao=new CustomerDaoImpl();
		List<Address> addresses=customerDao.getCustomeAddressrById(cid);
		
		for(Address address:addresses) {
			
			System.out.println("state   "+address.getState());
			System.out.println("city    "+address.getCity());
			System.out.println("pincode "+address.getPincode());
			System.out.println("Type    "+address.getType());

			System.out.println("--------------------------------");
		}
	}
	
}
