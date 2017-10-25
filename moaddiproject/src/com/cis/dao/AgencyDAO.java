package com.cis.dao;

import java.util.List;
import com.cis.dao.model.Agency;

public interface AgencyDAO {
	public Integer saveAgency(Agency agency);
	public List<Agency> getAgencies();
	public Agency getAgency(Integer agency_No);
	public void deleteAgency(Integer agency_No);
	public void updateAgency(Agency agency);
}
