package com.cis.service;

import java.util.List;

import com.cis.service.beans.AgencyBean;
import com.cis.service.beans.SupplierPageBean;

public interface SupplierPageService {
	
	public Integer saveSupplierPage(SupplierPageBean supplierPageBean);
	public List<SupplierPageBean> getAllSupplierPageBeans();
	public SupplierPageBean getSupplierPageBean(Integer lockId);
	public void  modifySupplier(SupplierPageBean supplierPageBean);
}
