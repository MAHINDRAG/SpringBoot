package com.mahi.mobileApp.entity;

public class Mobile {

	private String mobileCompany;
	private String mobileModel;
	private String mobileprice;
	private Integer mobileInternalGB;
	private Integer mobileRAM;
	
	public String getMobileCompany() {
		return mobileCompany;
	}
	public void setMobileCompany(String mobileCompany) {
		this.mobileCompany = mobileCompany;
	}
	public String getMobileModel() {
		return mobileModel;
	}
	public void setMobileModel(String mobileModel) {
		this.mobileModel = mobileModel;
	}
	public String getMobileprice() {
		return mobileprice;
	}
	public void setMobileprice(String mobileprice) {
		this.mobileprice = mobileprice;
	}
	public Integer getMobileInternalGB() {
		return mobileInternalGB;
	}
	public void setMobileInternalGB(Integer mobileInternalGB) {
		this.mobileInternalGB = mobileInternalGB;
	}
	public Integer getMobileRAM() {
		return mobileRAM;
	}
	public void setMobileRAM(Integer mobileRAM) {
		this.mobileRAM = mobileRAM;
	}
	
	@Override
	public String toString() {
		return "Mobile [mobileCompany=" + mobileCompany + ", mobileModel=" + mobileModel + ", mobileprice="
				+ mobileprice + ", mobileInternalGB=" + mobileInternalGB + ", mobileRAM=" + mobileRAM + "]";
	}
	
	
	
	
}
