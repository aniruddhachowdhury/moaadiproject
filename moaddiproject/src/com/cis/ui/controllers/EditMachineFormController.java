package com.cis.ui.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;


import com.cis.service.MachineService;
import com.cis.service.beans.MachineBean;


public class EditMachineFormController extends SimpleFormController
{
	private MachineService machineService;

	
	
	public void setMachineService(MachineService machineService) {
		this.machineService = machineService;
	}

	public ModelAndView onSubmit(HttpServletRequest request,HttpServletResponse response,Object command,BindException e)throws Exception
	{
		System.out.println("post");
		MachineForm machineForm=(MachineForm)command;
		MachineBean machineBean=new MachineBean();
		machineBean.setMachineNo(machineForm.getMachineNo());
		machineBean.setMachineId(machineForm.getMachineId());
		machineService.modifyMachine(machineBean);
		return new ModelAndView("redirect:machineslist.htm");
	}

	public Object formBackingObject(HttpServletRequest request)throws Exception
	{
		String machineNo=request.getParameter("machineNo");
		MachineBean machineBean=machineService.getMachine(new Integer(machineNo));
		MachineForm machineForm=new MachineForm();
		machineForm.setMachineNo(machineBean.getMachineNo());
		machineForm.setMachineId(machineBean.getMachineId());
		return machineForm;
		
	}
	
	
}
