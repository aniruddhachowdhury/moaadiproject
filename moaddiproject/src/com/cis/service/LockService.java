package com.cis.service;

import java.util.List;

import com.cis.service.beans.LockBean;
public interface LockService {
	
	public Integer saveLock(LockBean lockBean);
	public List<LockBean> getAllLock();
	public LockBean getLock(Integer lockNo);
	public void  modifyLock(LockBean lockBean);
	
	

}
