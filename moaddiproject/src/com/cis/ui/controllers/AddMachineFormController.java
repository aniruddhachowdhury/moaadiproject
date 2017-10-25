package com.cis.ui.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.cis.service.MachineService;

import com.cis.service.beans.MachineBean;

public class AddMachineFormController extends SimpleFormController{
	private MachineService machineService;

	public void setMachineService(MachineService machineService) {
		this.machineService = machineService;
	}
	public ModelAndView onSubmit(HttpServletRequest request,HttpServletResponse response,Object command,BindException e)throws Exception
	{
		MachineForm machineForm=(MachineForm)command;
		MachineBean machineBean=new MachineBean();
		/*machineBean.setMachineNo(machineForm.getMachineNo());*/
		machineBean.setMachineId(machineForm.getMachineId());
		machineService.saveMachine(machineBean);
		return new ModelAndView("redirect:machineslist.htm");
	  /*return new ModelAndView("redirect:employeelist.htm");*/
	}


}
