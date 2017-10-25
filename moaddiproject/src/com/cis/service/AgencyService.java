package com.cis.service;

import java.util.List;

import com.cis.service.beans.AgencyBean;
import com.cis.service.beans.LockBean;


public interface AgencyService {
	public Integer saveAgency(AgencyBean agencyBean);
	public List<AgencyBean> getAllAgency();
	public AgencyBean getAgency(Integer agency_No);
	public void  modifyAgency(AgencyBean agencyBean);
}
