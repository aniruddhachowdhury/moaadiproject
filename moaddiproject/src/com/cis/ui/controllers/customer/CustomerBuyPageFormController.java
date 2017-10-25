package com.cis.ui.controllers.customer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.RandomStringUtils;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.cis.service.SupplierPageService;
import com.cis.service.beans.SupplierPageBean;
import com.cis.ui.controllers.supplier.SupplierPageForm;
public class CustomerBuyPageFormController extends SimpleFormController{
	
	public SupplierPageService supplierPageService;
	
	public void setSupplierPageService(SupplierPageService supplierPageService) {
		this.supplierPageService = supplierPageService;
	}
	Integer password;
	public ModelAndView onSubmit(HttpServletRequest request,HttpServletResponse response,Object command,BindException e)throws Exception
	{
		
		
		
		SupplierPageForm supplierPageForm=(SupplierPageForm)command;
		SupplierPageBean supplierPageBean=new SupplierPageBean();
		supplierPageBean.setPassword(supplierPageForm.getPassword());
		supplierPageBean.setLockId(supplierPageForm.getLockId());
		supplierPageBean.setPrice(supplierPageForm.getPrice());
		supplierPageBean.setProductName(supplierPageForm.getProductName());
		supplierPageService.modifySupplier(supplierPageBean);
		
		return new ModelAndView("redirect:customerproductlist.htm");
	}
	public Object formBackingObject(HttpServletRequest request)throws Exception
	{
	String lockId=request.getParameter("lockID");
	System.out.println("lock id"+ lockId);
	SupplierPageBean supplierPageBean=supplierPageService.getSupplierPageBean(new Integer(lockId));
	//    SupplierPageBean supplierPageBean = new SupplierPageBean();
		SupplierPageForm supplierPageForm=new SupplierPageForm();
         supplierPageForm.setLockId(supplierPageBean.getLockId());
		supplierPageForm.setPrice(supplierPageBean.getPrice());
		supplierPageForm.setProductName(supplierPageBean.getProductName());
		System.out.println(supplierPageBean.getProductName()+"price in controll layer");
		System.out.println(supplierPageBean.getPrice()+"price in controll layer");
		supplierPageForm.setPassword(supplierPageBean.getPassword());
		System.out.println("Password"+supplierPageBean.getPassword());
		return supplierPageForm;
	}
}
