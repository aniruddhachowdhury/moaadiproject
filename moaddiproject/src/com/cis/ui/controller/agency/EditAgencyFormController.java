package com.cis.ui.controller.agency;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.cis.service.AgencyService;
import com.cis.service.beans.AgencyBean;


public class EditAgencyFormController extends SimpleFormController {
	private AgencyService  agencyService;

	
	

	public void setAgencyService(AgencyService agencyService) {
		this.agencyService = agencyService;
	}

	public ModelAndView onSubmit(HttpServletRequest request,HttpServletResponse response,Object command,BindException e)throws Exception
	{
		System.out.println("post");
		AgencyForm agencyForm=(AgencyForm)command;
		AgencyBean agencyBean=new AgencyBean();
		agencyBean.setAgency_No(agencyForm.getAgency_No());
		agencyBean.setAgencyId(agencyForm.getAgencyId());
		agencyBean.setRegion(agencyForm.getRegion());
		agencyService.modifyAgency(agencyBean);
		return new ModelAndView("redirect:agencyeslist.htm");
	}

	public Object formBackingObject(HttpServletRequest request)throws Exception
	{
		String agency_No=request.getParameter("agency_No");
		AgencyBean agencyBean=agencyService.getAgency(new Integer(agency_No));
		AgencyForm agencyForm=new AgencyForm();
		agencyForm.setAgency_No(agencyBean.getAgency_No());
		agencyForm.setAgencyId(agencyBean.getAgencyId());
		agencyForm.setRegion(agencyBean.getRegion());
		return agencyForm;
		
	}
	
}


