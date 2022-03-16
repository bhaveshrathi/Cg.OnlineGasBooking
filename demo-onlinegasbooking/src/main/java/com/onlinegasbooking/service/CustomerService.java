package com.onlinegasbooking.service;

import java.util.List;

import com.onlinegasbooking.entity.Customer;

/*******************************
 *          @author          Bhavesh Rathi
 *          Description      It is a customer service - Service class. It provides service 
 *                           methods for adding,updating,deleting,view customer data.
 *          Version          1.0     
 *          Created Date     11 - March - 2021
 ********************************/

public interface CustomerService {
	public Customer insertCustomer(Customer customer);
	public Customer updateCustomer(Customer customer);
	public Customer deleteCustomerById(Integer customerId);
	public List<Customer> viewCustomers();
	public Customer viewCustomer(Integer customerId);
	//public Customer validateCustomer(String username, String password);
}