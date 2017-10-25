package com.cis.dao;

import java.util.List;


import com.cis.dao.model.Machine;

public interface MachineDAO {
	public Integer saveMachine(Machine machine);
	public List<Machine> getAllMachines();
	public Machine getMachine(Integer machineNo);
	public void deleteMachine(Integer machineNo);
	public void updateMachine(Machine machine);
	
}
