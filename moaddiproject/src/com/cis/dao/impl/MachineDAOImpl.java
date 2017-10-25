package com.cis.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.cis.dao.MachineDAO;

import com.cis.dao.model.Machine;

public class MachineDAOImpl implements MachineDAO{
	private HibernateTemplate ht;
	public MachineDAOImpl(HibernateTemplate ht)
	{
		this.ht=ht;
	}
	@Override
	public Integer saveMachine(Machine machine) {
		// TODO Auto-generated method stub
		Integer no=(Integer)ht.save(machine);
		return no;
	}
	@Override
	public List<Machine> getAllMachines() {
		// TODO Auto-generated method stub
		return ht.find("from Machine");
	}
	@Override
	public Machine getMachine(Integer machineNo) {
		// TODO Auto-generated method stub
		
		return (Machine)ht.get(Machine.class, machineNo);
	}
	@Override
	public void deleteMachine(Integer machineNo) {
		// TODO Auto-generated method stub
		ht.delete(getMachine(machineNo));
		
	}
	@Override
	public void updateMachine(Machine machine) {
		// TODO Auto-generated method stub
		ht.update(machine);
	}
	
	
}
