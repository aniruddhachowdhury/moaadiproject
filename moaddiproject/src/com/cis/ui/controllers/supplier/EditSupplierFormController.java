package com.cis.ui.controllers.supplier;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import com.cis.service.SupplierService;
import com.cis.service.beans.SupplierBean;


public class EditSupplierFormController  extends SimpleFormController {
	private SupplierService  supplierService;

	
	

	public void setSupplierService(SupplierService supplierService) {
		this.supplierService = supplierService;
	}

	
	public ModelAndView onSubmit(HttpServletRequest request,HttpServletResponse response,Object command,BindException e)throws Exception
	{
		
		System.out.println("post");
		SupplierForm supplierForm=(SupplierForm)command;
		SupplierBean supplierBean=new SupplierBean();
		supplierBean.setRegion(supplierForm.getRegion());
		supplierBean.setSupplier_email(supplierForm.getSupplier_email());
		supplierBean.setSupplier_ID(supplierForm.getSupplier_ID());
		supplierBean.setSupplier_No(supplierForm.getSupplier_No());
		supplierBean.setSupplier_Name(supplierForm.getSupplier_Name());
		
		supplierService.modifySupplier(supplierBean);
		return new ModelAndView("redirect:supplierlist.htm");
	}
	public Object formBackingObject(HttpServletRequest request)throws Exception
	{
		String supplier_No=request.getParameter("supplier_No");
		SupplierBean supplierBean=supplierService.getSupplier(new Integer(supplier_No));
		SupplierForm supplierForm=new SupplierForm();
         supplierForm.setSupplier_No(supplierBean.getSupplier_No());
		supplierForm.setSupplier_ID(supplierBean.getSupplier_ID());
		supplierForm.setRegion(supplierBean.getRegion());
		supplierForm.setSupplier_email(supplierBean.getSupplier_email());
		supplierForm.setSupplier_Name(supplierBean.getSupplier_Name());
		
		return supplierForm;
	}
	
}
	