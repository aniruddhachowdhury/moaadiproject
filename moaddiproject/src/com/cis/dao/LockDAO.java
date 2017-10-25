package com.cis.dao;

import java.util.List;

import com.cis.dao.model.Lock1;

public interface LockDAO {
	public Integer saveLock(Lock1 lock1);
	public List<Lock1> getAllLock();
	public Lock1 getLock(Integer lockNo);
	public void deleteLock(Integer lockNo);
	public void updateLock(Lock1 lock1);
	
}
