package com.masai.Dao;

import java.util.List;

import com.masai.Entity.Address;
import com.masai.Entity.Customer;

public interface CustomerDao {

	
	public String registeredCustomer(Customer customer);
	public Customer getCustomerById(Integer cid);
	public List<Address> getCustomeAddressrById(Integer cid);
	public String AddAddressToCustomer(Integer cid,Address address);
	
	
	
	
}
