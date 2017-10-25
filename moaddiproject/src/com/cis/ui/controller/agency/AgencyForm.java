package com.cis.ui.controller.agency;

import java.util.Date;



public class AgencyForm {
	private String region;
    private String agencyId;
	private Integer agency_No;
	private Date date;
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	private String password;
	private String email;
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRegion() {
		return region;
		
		
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getAgencyId() {
		return agencyId;
	}
	public void setAgencyId(String agencyId) {
		this.agencyId = agencyId;
	}
	public Integer getAgency_No() {
		return agency_No;
	}
	public void setAgency_No(Integer agency_No) {
		this.agency_No = agency_No;
	}
	
}
