package com.cis.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import com.cis.dao.AgencyDAO;
import com.cis.dao.model.Agency;
import com.cis.dao.model.Lock1;
import com.cis.dao.model.Machine;
import com.cis.service.AgencyService;
import com.cis.service.beans.AgencyBean;
import com.cis.service.beans.MachineBean;


public class AgencyServiceImp implements AgencyService{
	private AgencyDAO agencyDAO;
	public AgencyServiceImp(AgencyDAO agencyDAO)
	{
		this.agencyDAO=agencyDAO;
	}
	@Override
	public Integer saveAgency(AgencyBean agencyBean) {
		Agency agency=new Agency();
		agency.setAgency_No(agencyBean.getAgency_No());
		agency.setAgencyId(agencyBean.getAgencyId());
		agency.setRegion(agencyBean.getRegion());
		agency.setDate(agencyBean.getDate());
		agency.setPassword(agencyBean.getPassword());
		agency.setEmail(agencyBean.getEmail());
		return agencyDAO.saveAgency(agency);
		// TODO Auto-generated method stub
			}
	@Override
	public List<AgencyBean> getAllAgency() {
		List<AgencyBean> agencies=null;
		List<Agency> lagency=agencyDAO.getAgencies();
		if(lagency!=null)
		{
			agencies=new ArrayList<AgencyBean>();
			ListIterator<Agency> li=lagency.listIterator();
			while(li.hasNext())
			{
				Agency agency=li.next();
				AgencyBean agencyBean=new AgencyBean();
				System.out.println("region no" + agency.getRegion()+"seviceimpl" );
				agencyBean.setAgency_No(agency.getAgency_No());
				agencyBean.setAgencyId(agency.getAgencyId());
				agencyBean.setRegion(agency.getRegion());
				agencies.add(agencyBean);
			}
		}
		
		return agencies;
	}
		// TODO Auto-generated method stub
	
	@Override
	public AgencyBean getAgency(Integer agency_No) {
Agency agency=agencyDAO.getAgency(agency_No);
		
		AgencyBean agencyBean=null;
		if(agency !=null)
		{
			agencyBean=new AgencyBean();
			agencyBean.setAgency_No(agency.getAgency_No());
			agencyBean.setAgencyId(agency.getAgencyId());
			agencyBean.setRegion(agency.getRegion());
			
		
		}
		return agencyBean;
	}
	@Override
	public void modifyAgency(AgencyBean agencyBean) {
		// TODO Auto-generated method stub
		Agency agency =new Agency();
		agency.setAgency_No(agencyBean.getAgency_No());
		agency.setAgencyId(agencyBean.getAgencyId());
		agency.setRegion(agencyBean.getRegion());
		agencyDAO.updateAgency(agency);
		
	}

	

}
