package com.cis.ui.controllers.supplier;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.cis.service.SupplierService;
import com.cis.service.beans.SupplierBean;
import com.cis.ui.controllers.supplier.SupplierForm;

public class AddSupplierFormController  extends SimpleFormController{
	private SupplierService supplierService;

	public void setSupplierService(SupplierService supplierService) {
		this.supplierService = supplierService;
	}
	public ModelAndView onSubmit(HttpServletRequest request,HttpServletResponse response,Object command,BindException e)throws Exception
	{
		SupplierForm supplierForm=(SupplierForm)command;
		SupplierBean supplierBean=new SupplierBean();
		
		supplierBean.setSupplier_ID(supplierForm.getSupplier_ID());
		supplierBean.setRegion(supplierForm.getRegion());
		supplierBean.setSupplier_Name(supplierForm.getSupplier_Name());
		supplierBean.setSupplier_email(supplierForm.getSupplier_email());
	    supplierService.saveSupplier(supplierBean);
		return new ModelAndView("redirect:supplierlist.htm");
	  /*return new ModelAndView("redirect:employeelist.htm");*/
	}
}
