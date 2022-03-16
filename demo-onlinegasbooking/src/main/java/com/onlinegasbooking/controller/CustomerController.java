package com.onlinegasbooking.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onlinegasbooking.entity.Customer;
import com.onlinegasbooking.service.CustomerService;

/*******************************
 *          @author          Bhavesh Rathi
 *          Description      It is a CustomerController - controller class. It provides 
 *                           RestMappings inorder to connect with the swagger. 
 *          Version          1.0     
 *          Created Date     11 - March - 2021
 ********************************/

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerservice;
    // for inserting the customers
    @PostMapping("/customer")
    public Customer insertCustomer (@RequestBody Customer customer) {
        return customerservice.insertCustomer(customer);
        }
    // for updating the  customers
    @PutMapping("/customer")
    public Customer updateCustomer (@RequestBody Customer customer) {

        return customerservice.updateCustomer(customer);
        }
    // for deleting customers by Id
    @DeleteMapping("/customer/{customerId}")
    public Customer deleteCustomerById (@PathVariable Integer customerId) {

        return customerservice.deleteCustomerById(customerId);
    }
    // to get list of all customers 
    @GetMapping("/customer")
    public List<Customer>viewCustomers(@RequestBody List<Customer> customer){
    	return customerservice.viewCustomers();
    }
    // to view customers 
    @GetMapping("/customer/{customerId}")
    public Customer viewCustomer(@PathVariable int customerId) {
    	return customerservice.viewCustomer(customerId);
    }
   /* @GetMapping("/customer")
    public Customer validateCustomer(@RequestBody String username,@RequestBody String password) {
    	return customerservice.validateCustomer(username, password);
    }*/
}