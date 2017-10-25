package com.cis.ui.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;


import com.cis.service.LockService;
import com.cis.service.beans.LockBean;


public class EditLockFormController extends SimpleFormController
{
	private LockService  lockService;

	public EditLockFormController(LockService  lockService){
		this.lockService = lockService;
	}
	
	

	public ModelAndView onSubmit(HttpServletRequest request,HttpServletResponse response,Object command,BindException e)throws Exception
	{
		System.out.println("post");
		LockForm lockForm=(LockForm)command;
		LockBean lockBean=new LockBean();
		lockBean.setLockNo(lockForm.getLockNo());
		lockBean.setLockID(lockForm.getLockID());
		lockService.modifyLock(lockBean);
		return new ModelAndView("redirect:locklist.htm");
	}

	public Object formBackingObject(HttpServletRequest request)throws Exception
	{
		String lockNo=request.getParameter("lockNo");
		LockBean lockBean=lockService.getLock(new Integer(lockNo));
		LockForm lockForm=new LockForm();
		lockForm.setLockNo(lockBean.getLockNo());
		lockForm.setLockID(lockBean.getLockID());
		return lockForm;
		
	}
	
}
