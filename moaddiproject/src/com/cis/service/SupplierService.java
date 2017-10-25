package com.cis.service;

import java.util.List;
import com.cis.service.beans.SupplierBean;
public interface SupplierService {
	
	public Integer saveSupplier(SupplierBean supplierBean);
	public List<SupplierBean> getAllSupplier();
	public SupplierBean getSupplier(Integer supplier_No);
	public void  modifySupplier(SupplierBean supplierBean);
	}
