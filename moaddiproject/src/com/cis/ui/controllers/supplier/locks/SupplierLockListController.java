package com.cis.ui.controllers.supplier.locks;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.cis.service.LockService;
import com.cis.service.beans.LockBean;

public class SupplierLockListController implements Controller{
	private LockService lockService;

	public void setLockService(LockService lockService) {
		this.lockService = lockService;
	}



	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		List<LockBean> locks=lockService.getAllLock();
		
		request.setAttribute("locks",locks);
		
		return new ModelAndView("WEB-INF/Supplier/supplierlocklist");
		
	}

}
