package com.springboot.curd.SpringMongoDB;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.springboot.curd.SpringMongoDB.registration.model.CustomerService;

@RunWith(SpringRunner.class)
@WebMvcTest(value = CustomerService.class , secure = false)
public class TestCustomerService {
	@Autowired
	private MockMvc mockMvc;

	@Test
	public void testCreateData() {
		fail("Not yet implemented");
	}

}
