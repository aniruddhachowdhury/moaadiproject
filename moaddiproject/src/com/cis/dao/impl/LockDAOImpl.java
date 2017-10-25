package com.cis.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;


import com.cis.dao.LockDAO;
import com.cis.dao.model.Lock1;

public class LockDAOImpl implements LockDAO {
	private HibernateTemplate ht;
	public LockDAOImpl(HibernateTemplate ht){
		this.ht=ht;
	}
	@Override
	public Integer saveLock(Lock1 lock1) {
		
		// TODO Auto-generated method stub
		Integer lockNo=(Integer)ht.save(lock1);
		System.out.println("controll heare2");
		return lockNo;
		
	}
	@Override
	public List<Lock1> getAllLock() {
		// TODO Auto-generated method stub
		return ht.find("from Lock1");
		
	}
	@Override
	public Lock1 getLock(Integer lockNo) {
		// TODO Auto-generated method stub
		return (Lock1)ht.get(Lock1.class, lockNo);
	}
	@Override
	public void deleteLock(Integer lockNo) {
		// TODO Auto-generated method stub
		ht.delete(getLock(lockNo));
	}
	@Override
	public void updateLock(Lock1 lockNo) {
		// TODO Auto-generated method stub
		ht.update(lockNo);
	}	
}
