package com.onlinegasbooking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onlinegasbooking.entity.Customer;

/*******************************
 *          @author          Bhavesh Rathi
 *          Description      It is a repository class that provides the JPA Repository for   
 *                           Customer.      
 *         Version           1.0     
 *         Created Date      08 - March - 2021
 ********************************/

@Repository // ( No need to write this as it is provided by JpaRepository

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}