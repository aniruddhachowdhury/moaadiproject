package com.cis.ui.controllers;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.cis.dao.LockDAO;
import com.cis.dao.model.Lock1;
import com.cis.service.LockService;
import com.cis.service.beans.LockBean;
import com.ibm.icu.util.RangeValueIterator.Element;


public class LockListController implements Controller{
	private LockService lockService;
	public void setLockService(LockService lockService) {
		this.lockService = lockService;
	}



	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		List<LockBean> locks=lockService.getAllLock();
		System.out.println("Download in controller");
		request.setAttribute("locks",locks);
		
		return new ModelAndView("locklist");
		
	}
	
}

