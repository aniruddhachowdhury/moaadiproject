package com.cis.ui.controllers.supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.cis.service.LockService;
import com.cis.service.SupplierPageService;
import com.cis.service.SupplierService;
import com.cis.service.beans.LockBean;
import com.cis.service.beans.SupplierBean;
import com.cis.service.beans.SupplierPageBean;

public class SupplierHistoryListController implements Controller{
	private SupplierPageService supplierPageService;
	public void setSupplierPageService(SupplierPageService supplierPageService) {
		this.supplierPageService = supplierPageService;
	}
	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
			List<SupplierPageBean> supplierhistory=supplierPageService.getAllSupplierPageBeans();
			
		
		request.setAttribute("supplierhistory",supplierhistory);
		
		return new ModelAndView("WEB-INF/Supplier/supplierhistorylist");
		
	}

}
