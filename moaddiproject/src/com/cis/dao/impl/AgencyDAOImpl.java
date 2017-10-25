package com.cis.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.cis.dao.AgencyDAO;
import com.cis.dao.model.Agency;



public class AgencyDAOImpl implements AgencyDAO {
	private HibernateTemplate ht;
	public AgencyDAOImpl(HibernateTemplate ht){
		this.ht=ht;
	}
	
	@Override
	public Integer saveAgency(Agency agency) {
		// TODO Auto-generated method stub
		Integer agencyId=(Integer)ht.save(agency);
		return agencyId;
				}

	
	@Override
	public List<Agency> getAgencies() {
		// TODO Auto-generated method stub
	
		return ht.find("from Agency");
		
	}

	@Override
	public Agency getAgency(Integer agency_No) {
		// TODO Auto-generated method stub
		return (Agency)ht.get(Agency.class, agency_No);
	}

	@Override
	public void deleteAgency(Integer agency_No) {
		// TODO Auto-generated method stub
		ht.delete(getAgency(agency_No));
	
	}

	@Override
	public void updateAgency(Agency agency_No) {
		// TODO Auto-generated method stub
		ht.update(agency_No);
	}
	
}
