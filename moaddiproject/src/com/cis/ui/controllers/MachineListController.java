package com.cis.ui.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.cis.service.MachineService;

import com.cis.service.beans.MachineBean;

public class MachineListController implements Controller{
	private MachineService machineService;

	public void setMachineService(MachineService machineService) {
		this.machineService = machineService;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		List<MachineBean> machines=machineService.getAllMachines();
		
		request.setAttribute("machines",machines);
		
		
		
		return new ModelAndView("machineslist");
		
	}

}
