package com.cis.ui.controller.agency;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import com.cis.service.AgencyService;
import com.cis.service.beans.AgencyBean;

public class AgencyViewController implements Controller{
private AgencyService agencyService;

	
	public void setAgencyService(AgencyService agencyService) {
	this.agencyService = agencyService;
}


	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(request.getParameter("agency_No"));
		AgencyBean agency=agencyService.getAgency(new Integer(request.getParameter("agency_No")));
		System.out.println("return controller");
		
		request.setAttribute("agency", agency);
		System.out.println("return controller1");
		return new ModelAndView("WEB-INF/agency/view");
	}

}