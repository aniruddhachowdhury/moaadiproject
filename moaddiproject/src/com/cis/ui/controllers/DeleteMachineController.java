package com.cis.ui.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;


import com.cis.dao.MachineDAO;

public class DeleteMachineController implements Controller {
private MachineDAO machineDAO;

public MachineDAO getMachineDAO() {
	return machineDAO;
}

public void setMachineDAO(MachineDAO machineDAO) {
	this.machineDAO = machineDAO;
}

@Override
public ModelAndView handleRequest(HttpServletRequest request,
		HttpServletResponse response) throws Exception {
	// TODO Auto-generated method stub
	String machineNo=request.getParameter("machineNo");
 // System.out.println(machineNo);
    machineDAO.deleteMachine(new Integer(machineNo));
     
	
	return new ModelAndView("redirect:machineslist.htm");
}
	
	
}
