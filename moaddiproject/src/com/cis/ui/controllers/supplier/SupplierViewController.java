package com.cis.ui.controllers.supplier;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.cis.service.SupplierPageService;
import com.cis.service.SupplierService;
import com.cis.service.beans.SupplierBean;
import com.cis.service.beans.SupplierPageBean;

public class SupplierViewController implements Controller{
private SupplierService supplierService;



	public void setSupplierService(SupplierService supplierService) {
	this.supplierService = supplierService;
}


	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
	
		
		System.out.println(supplierService.getSupplier(new Integer(request.getParameter("supplier_No"))));
		//AgencyBean agency=agencyService.getAgency(new Integer(request.getParameter("agencyNo")));
		SupplierBean supplier=supplierService.getSupplier(new Integer(request.getParameter("supplier_No")));

		request.setAttribute("supplier", supplier);
		
		return new ModelAndView("WEB-INF/Supplier/viewsupplier");
	}

}
