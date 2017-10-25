package com.cis.ui.controllers;
import java.io.File;
import java.io.FileInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.cis.service.LockService;
import com.cis.service.beans.LockBean;

public class AddLockFormController extends SimpleFormController{
	private LockService lockService;

	public void setLockService(LockService lockService) {
		this.lockService = lockService;
	}
	public ModelAndView onSubmit(HttpServletRequest request,HttpServletResponse response,Object command,BindException e)throws Exception
	{
		LockForm lockForm=(LockForm)command;
		LockBean lockBean=new LockBean();
		lockBean.setLockID(lockForm.getLockID());
		lockService.saveLock(lockBean);
		return new ModelAndView("redirect:locklist.htm");
	}


}
