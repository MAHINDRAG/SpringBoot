package com.springboot.curd.SpringMongoDB.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.curd.SpringMongoDB.registration.model.CustomerRegistration;
import com.springboot.curd.SpringMongoDB.registration.model.CustomerService;
@RestController
public class RegistrationController {

	@Autowired
	private CustomerService customerService;
	@RequestMapping(method = RequestMethod.POST , value="/registration")
	public String createData(@RequestBody CustomerRegistration customerRegistration){
		return customerService.createData(customerRegistration);
	}

	@RequestMapping(method = RequestMethod.GET , value = "/registration")
	private Iterable<CustomerRegistration> readData(){
		return customerService.readData();
	}

	@RequestMapping(method = RequestMethod.GET , value = "/registration/{code}")
	private CustomerRegistration queryData(@PathVariable("code") String customerCode){
		return customerService.queryData(customerCode);
	}

	@RequestMapping(method = RequestMethod.PUT , value = "/registration/{code}")
	private String updateData(@RequestBody CustomerRegistration customerRegistration, @PathVariable("code") String customerCode){
		return customerService.updateData(customerRegistration, customerCode);
	}
	
	@RequestMapping(method = RequestMethod.DELETE , value = "/registration/{code}")
	private String deleteData(@PathVariable("code") String code){
		return customerService.deleteData(code);
	}
}
