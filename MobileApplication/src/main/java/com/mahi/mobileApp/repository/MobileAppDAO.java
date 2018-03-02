package com.mahi.mobileApp.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mahi.mobileApp.entity.Mobile;

@Component
public class MobileAppDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate; 
	Map<String,String> resultMap = new HashMap<String,String>();
	String message = null;
	ObjectMapper mapperobj = new ObjectMapper();
	String jsonResponse = null;

	public String createData(Mobile mobile) {
		String company = mobile.getMobileCompany();
		String model = mobile.getMobileModel();
		String price = mobile.getMobileprice();
		jdbcTemplate.execute("insert into Mobile (Mobile_Company, Mobile_Model, Mobile_Price, Mobile_Internal_GB, Mobile_RAM_GB) values('"+company+"','"+model+"','"+price+"',"+mobile.getMobileInternalGB()+","+mobile.getMobileRAM()+")");
		return "Record inserted in Database Successfully";
	}


	public String updateData(Mobile mobile) {
		String sql = "update Mobile set Mobile_Model='"+mobile.getMobileModel()+"', Mobile_Price='"+mobile.getMobileprice()+"', Mobile_Internal_GB='"+mobile.getMobileInternalGB()+"', Mobile_RAM_GB='"+mobile.getMobileRAM()+"' where Mobile_Company='"+mobile.getMobileCompany()+"'";
		int count = 0;
		try {
			count = jdbcTemplate.update(sql);		
			System.out.println("Count:"+count);
			message = count+ " Record updated Successfully";
			resultMap.put("resultCode", "0");
			resultMap.put("resultMessage", message);
			jsonResponse = mapperobj.writeValueAsString(resultMap);
		}catch(Exception e) {
			resultMap.put("resultCode", "-1");
			resultMap.put("resultMessage", "Exception Occured while updating the Data "+e.getMessage());
			try {
				jsonResponse = mapperobj.writeValueAsString(resultMap);
			} catch (JsonProcessingException e1) {
				e1.printStackTrace();
			}
			System.out.println("Exception Occured while updating the Data"+e.getMessage());
		}

		return jsonResponse;
	}


	public String deleteData(Mobile mobile) {
		String sql = "delete from Mobile where mobile_model = '"+mobile.getMobileModel()+"'";
		int count = jdbcTemplate.update(sql);
		System.out.println("Count:"+count);
		message = count+ " Record deleted Successfully";
		resultMap.put("resultCode", "0");
		resultMap.put("resultMessage", message);
		try {
			jsonResponse = mapperobj.writeValueAsString(resultMap);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return jsonResponse;
	}
	
	@Transactional(readOnly=true)
	public Mobile getMobileDatausingModel(String mobileModel) {
		String sql = "select * from Mobile where Mobile_Model = ?";
		Mobile mobile = jdbcTemplate.queryForObject(sql, new MobileRowMapper(),mobileModel);
		return mobile;
	}
	
	public List<Mobile> getAllMobileDetails() {
		String sql =  "select * from Mobile";
		List<Mobile> allMobileDetails = jdbcTemplate.query(sql,new MobileRowMapper());
		return allMobileDetails;
	}
	
}
