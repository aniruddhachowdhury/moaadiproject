package com.cis.ui.controller.agency;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.cis.service.AgencyService;
import com.cis.service.beans.AgencyBean;

	public class AddAgencyFormController extends SimpleFormController{
		private AgencyService agencyService;

		public void setAgencyService(AgencyService agencyService) {
			this.agencyService = agencyService;
		}
		public ModelAndView onSubmit(HttpServletRequest request,HttpServletResponse response,Object command,BindException errors )throws Exception
		{
			AgencyForm agencyForm=(AgencyForm)command;
			AgencyBean agencyBean=new AgencyBean();
			agencyBean.setAgency_No(agencyForm.getAgency_No());
			agencyBean.setAgencyId(agencyForm.getAgencyId());
			agencyBean.setRegion(agencyForm.getRegion());
			System.out.println("region:" +agencyForm.getRegion());
			System.out.println("Date:" +agencyForm.getDate());
			System.out.println("password:" +agencyForm.getPassword());
           System.out.println("email:" +agencyForm.getEmail());
			agencyBean.setDate(agencyForm.getDate());
			agencyBean.setPassword(agencyForm.getPassword());
			agencyBean.setEmail(agencyForm.getEmail());
			agencyService.saveAgency(agencyBean);
			return new ModelAndView("redirect:agencyeslist.htm");
		  
		}


	}


