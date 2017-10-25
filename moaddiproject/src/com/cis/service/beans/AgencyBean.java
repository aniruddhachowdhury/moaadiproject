package com.cis.service.beans;

import java.util.Date;
public class AgencyBean {
	private Integer agency_No;
	private String region;
    private String agencyId;
    private Date date;
	private String password;
	private String email;
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
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
	public Integer getAgency_No() {
		return agency_No;
	}
	public void setAgency_No(Integer agency_No) {
		this.agency_No = agency_No;
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

}
