package com.springboot.curd.SpringMongoDB.registration.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import com.springboot.curd.SpringMongoDB.registration.repositories.RegistrationRepository;

@Service
public class CustomerService {

	@Autowired
	private RegistrationRepository registrationRepository;


	public String createData(@RequestBody CustomerRegistration customerRegistration) {
		registrationRepository.save(customerRegistration);
		return "Registration Completed Successfully";
	}

	public Iterable<CustomerRegistration> readData() {
		return registrationRepository.findAll();
	}

	public CustomerRegistration queryData(String customerCode) {
		return registrationRepository.findOne(customerCode);
	}

	public String updateData(CustomerRegistration customerRegistration, String customerCode) {
		CustomerRegistration code = registrationRepository.findOne(customerCode);
		try{
			if(code.getCustomerCode().equals(customerCode) && (code.getCustomerCode()!=null)){
				registrationRepository.save(customerRegistration);	
			}
			return "Record updated Successfully";
		}catch(Exception e){
			e.getMessage();
			return "Error Occured while updating Data";
		}
	}

	public String deleteData(String code) {
		registrationRepository.delete(code);
		return "Record deleted Successfully";
	}

}
