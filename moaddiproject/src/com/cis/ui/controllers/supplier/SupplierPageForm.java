package com.cis.ui.controllers.supplier;

public class SupplierPageForm {
	private Integer lockId;
	private String productName;
	private String price;
	public Integer getLockId() {
		return lockId;
	}
	public void setLockId(Integer lockId) {
		this.lockId = lockId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String password;

}
