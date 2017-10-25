package com.cis.ui.controller.agency;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.cis.dao.AgencyDAO;

public class DeleteAgencyController implements Controller {
	private AgencyDAO agencyDAO;

	public void setAgencyDAO(AgencyDAO agencyDAO) {
		this.agencyDAO = agencyDAO;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		String agency_No=request.getParameter("agency_No");
	 // System.out.println(machineNo);
		agencyDAO.deleteAgency(new Integer(agency_No));
	     
		
		return new ModelAndView("redirect:agencyeslist.htm");
	}
}
