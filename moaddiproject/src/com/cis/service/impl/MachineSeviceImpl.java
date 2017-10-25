package com.cis.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import com.cis.dao.MachineDAO;

import com.cis.dao.model.Machine;
import com.cis.service.MachineService;

import com.cis.service.beans.MachineBean;

public class MachineSeviceImpl implements MachineService{
	private MachineDAO machineDAO;
	public MachineSeviceImpl(MachineDAO machineDAO)
	{
		this.machineDAO=machineDAO;
	}
	@Override
	public Integer saveMachine(MachineBean machineBean) {
		// TODO Auto-generated method stub
		Machine machine=new Machine();
		/*machine.setMachineNo(machineBean.getMachineNo());*/
		machine.setMachineId(machineBean.getMachineId());
		return machineDAO.saveMachine(machine);
		
	}
	@Override
	public List<MachineBean> getAllMachines() {
		List<MachineBean> machines=null;
		List<Machine> lmachines=machineDAO.getAllMachines();
		if(lmachines!=null)
		{
			machines=new ArrayList<MachineBean>();
			ListIterator<Machine> li=lmachines.listIterator();
			while(li.hasNext())
			{
				Machine machine=li.next();
				MachineBean machineBean=new MachineBean();
				machineBean.setMachineNo(machine.getMachineNo());
				machineBean.setMachineId(machine.getMachineId());
				machines.add(machineBean);
			}
		}
		
		return machines;
	}
	@Override
	public MachineBean getMachine(Integer machineNo) {
		// TODO Auto-generated method stub
Machine machine=machineDAO.getMachine(machineNo);
		
		MachineBean machineBean=null;
		if(machine !=null)
		{
			machineBean=new MachineBean();
			machineBean.setMachineNo(machine.getMachineNo());
			machineBean.setMachineId(machine.getMachineId());
			
		
		}
		return machineBean;
	}
	@Override
	public void modifyMachine(MachineBean machineBean) {
		// TODO Auto-generated method stub
		Machine machine=new Machine();
		machine.setMachineNo(machineBean.getMachineNo());
		machine.setMachineId(machineBean.getMachineId());
		
		machineDAO.updateMachine(machine);
		
	}
	

}
