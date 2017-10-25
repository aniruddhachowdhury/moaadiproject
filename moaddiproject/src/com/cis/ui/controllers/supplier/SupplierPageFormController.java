package com.cis.ui.controllers.supplier;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.RandomStringUtils;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.cis.service.SupplierPageService;
import com.cis.service.beans.SupplierPageBean;
public class SupplierPageFormController extends SimpleFormController{
	
	public SupplierPageService supplierPageService;
	
	public void setSupplierPageService(SupplierPageService supplierPageService) {
		this.supplierPageService = supplierPageService;
	}
	Integer password;
	public ModelAndView onSubmit(HttpServletRequest request,HttpServletResponse response,Object command,BindException e)throws Exception
	{
		
	String  password=null;
		System.out.println("post");
		 /*String alphabet = "0123456789";
	        int i = 0;
	        int Alphalaenge = alphabet.length();
	        
	        while(i < 4){
	                int rand = (int) (Math.random() * Alphalaenge);
	                
	               char pass=alphabet.charAt(rand);
	                password= String.valueOf(pass);
	                
	          //       if(rand!=0)
	                	 password=rand;
	            System.out.print(password);
	            ++i;
	        }*/
		
		System.out.println(password+":in generate password code");
		SupplierPageForm supplierPageForm=(SupplierPageForm)command;
		SupplierPageBean supplierPageBean=new SupplierPageBean();
		supplierPageBean.setLockId(supplierPageForm.getLockId());
		supplierPageBean.setPrice(supplierPageForm.getPrice());
		supplierPageBean.setProductName(supplierPageForm.getProductName());
		for (int i = 0; i < 8; i++) {
		    System.out.println(RandomStringUtils.randomAlphabetic(8));
		   RandomStringUtils.randomAlphabetic(8);
		}
		
		password=RandomStringUtils.randomAlphabetic(8);
		
		
		supplierPageBean.setPassword(password);
		System.out.println(supplierPageBean.getPassword()+":-in supplier lock edit");
		
		supplierPageService.modifySupplier(supplierPageBean);
		
		return new ModelAndView("redirect:supplierlist.htm");
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
		return supplierPageForm;
	}
}
