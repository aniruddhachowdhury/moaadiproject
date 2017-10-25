package com.cis.ui.controllers;

import java.io.File;

import org.springframework.web.multipart.MultipartFile;

public class LockForm {
	
	
	private Integer lockNo;
	private String lockID;
	


	public Integer getLockNo() {
		return lockNo;
	}
	public void setLockNo(Integer lockNo) {
		this.lockNo = lockNo;
	}
	public String getLockID() {
		return lockID;
	}
	public void setLockID(String lockID) {
		this.lockID = lockID;
	}
}
