package com.cis.dao.model;

import java.io.File;

public class Lock1 {
	
	
	private Integer lockNo;
	private String lockID;
	private File file;
	private byte[] data;
	
	public File getFile() {
		return file;
	}
	public void setFile(File file) {
		this.file = file;
	}
	public byte[] getData() {
		return data;
	}
	public void setData(byte[] data) {
		this.data = data;
	}
	public String getLockID() {
		return lockID;
	}
	public void setLockID(String lockID) {
		this.lockID = lockID;
	}
	public Integer getLockNo() {
		return lockNo;
	}
	public void setLockNo(Integer lockNo) {
		this.lockNo = lockNo;
	}
	

	


}
