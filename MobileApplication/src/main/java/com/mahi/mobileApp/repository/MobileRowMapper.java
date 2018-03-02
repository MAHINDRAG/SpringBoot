package com.mahi.mobileApp.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.mahi.mobileApp.entity.Mobile;

public class MobileRowMapper implements RowMapper<Mobile> {

	@Override
	public Mobile mapRow(ResultSet rs, int count) throws SQLException {
		Mobile mobile = new Mobile();
		mobile.setMobileCompany(rs.getString(1));
		mobile.setMobileModel(rs.getString(2));
		mobile.setMobileprice(rs.getString(3));
		mobile.setMobileInternalGB(rs.getInt(4));
		mobile.setMobileRAM(rs.getInt(5));
		return mobile;
	}

}
