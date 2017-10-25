package com.cis.dao;

import java.util.List;

import com.cis.dao.model.Agency;
import com.cis.dao.model.SupplierPage;;

public interface SupplierPageDAO {
	public Integer savePassword(SupplierPage supplierpage);
	public List<SupplierPage> getAllSupplierPage();
	public SupplierPage getSupplierPage(Integer lockId);
	public void updateItems(SupplierPage supplierPage);
}
