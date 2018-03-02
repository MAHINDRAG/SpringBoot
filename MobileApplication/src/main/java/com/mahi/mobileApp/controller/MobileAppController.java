package com.mahi.mobileApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mahi.mobileApp.entity.Mobile;
import com.mahi.mobileApp.repository.MobileAppDAO;

@RestController
@RequestMapping("/dataservice")
public class MobileAppController {

	@Autowired
	private MobileAppDAO mobileAppDAO;
	
	@RequestMapping(method = RequestMethod.POST , value="/insert/mobileDetails")
	public String insertData(@RequestBody Mobile mobile) {
		return mobileAppDAO.createData(mobile);
	}
	
	@RequestMapping(method = RequestMethod.PUT , value="/update/mobileDetails")
	public String updateData(@RequestBody Mobile mobile) {
		return mobileAppDAO.updateData(mobile);		
	}
	
	@RequestMapping(method = RequestMethod.DELETE , value="/delete/mobileDetails")
	public String deleteData(@RequestBody Mobile mobile) {
		return mobileAppDAO.deleteData(mobile);
	}
	
	@RequestMapping(method = RequestMethod.GET , value="/get/mobileDetails",produces="application/json")
	public Mobile getMobileDatausingModel(@RequestParam("mobile_model") String mobileModel) {
		return mobileAppDAO.getMobileDatausingModel(mobileModel);
	}
	
	@RequestMapping(method = RequestMethod.GET , value="/getAllMobileDetails",produces="application/json")
	public List<Mobile> getAllMobileDetails() {
		return mobileAppDAO.getAllMobileDetails();
	}
}
