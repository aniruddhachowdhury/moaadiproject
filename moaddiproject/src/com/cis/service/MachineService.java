package com.cis.service;

import java.util.List;


import com.cis.service.beans.MachineBean;

public interface MachineService {
	public Integer saveMachine(MachineBean machineBean);
	public List<MachineBean> getAllMachines();
	public MachineBean getMachine(Integer machineNo);
	public void modifyMachine(MachineBean machineBean);
	
}
