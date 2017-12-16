package com.springboot.curd.SpringMongoDB.registration.repositories;

import org.springframework.data.repository.CrudRepository;

import com.springboot.curd.SpringMongoDB.registration.model.CustomerRegistration;

public interface RegistrationRepository extends CrudRepository<CustomerRegistration,String>{

	
}
