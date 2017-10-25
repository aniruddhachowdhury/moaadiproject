package com.cis.ui.controller.agency;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.cis.service.AgencyService;

import com.cis.service.beans.AgencyBean;;

public class AgencyListController implements Controller{
	private AgencyService agencyService;

	public void setAgencyService(AgencyService agencyService) {
		this.agencyService =  agencyService;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		List<AgencyBean> agencies=agencyService.getAllAgency();
		request.setAttribute("agencies",agencies);
		return new ModelAndView("WEB-INF/agency/agencyeslist");
		
	}

}

