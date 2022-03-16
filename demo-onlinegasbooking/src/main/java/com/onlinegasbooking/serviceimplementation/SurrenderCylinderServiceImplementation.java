package com.onlinegasbooking.serviceimplementation;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinegasbooking.entity.Customer;
import com.onlinegasbooking.entity.SurrenderCylinder;
import com.onlinegasbooking.repository.CustomerRepository;
import com.onlinegasbooking.repository.SurrenderCylinderRepository;
//import com.onlinegasbooking.repository.SurrenderCylinderRepository;
import com.onlinegasbooking.service.SurrenderCylinderService;

@Service
public class SurrenderCylinderServiceImplementation implements SurrenderCylinderService {

	@Autowired
	private SurrenderCylinderRepository surrenderCylinderRepository;
	@Autowired
	private CustomerRepository customerRespository;

	public SurrenderCylinder addSurrenderCylinder(SurrenderCylinder surrenderCylinder) {
		Integer custId = surrenderCylinder.getCustomer().getCustomerId();
		Optional<Customer> optionalCustomer = this.customerRespository.findById(custId);
		//if(optionalCustomer.isEmpty())
		//	throw new SurrendorCylinderException("Customer id not found to surrender Cylinder");
		surrenderCylinder.setCustomer(optionalCustomer.get());
		return surrenderCylinderRepository.save(surrenderCylinder);
	}

	public SurrenderCylinder updateSurrenderCylinder(SurrenderCylinder surrenderCylinder) {
		return surrenderCylinderRepository.save(surrenderCylinder);
	}

	public SurrenderCylinder deleteSurrenderCylinder(Integer surrenderId) {
		return null;// surrenderCylinderRepository.deleteSurrenderCylinder(surrenderId);
	}
	/*
	 * public Integer countSurrenderCylinder(Integer surrenderId) { return
	 * surrenderCylinderRepository.countSurrenderCylinder(surrenderId); }
	 */

}
