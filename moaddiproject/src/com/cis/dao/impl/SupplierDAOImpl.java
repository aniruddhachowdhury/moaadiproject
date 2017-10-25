package com.cis.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.cis.dao.SupplierDAO;
import com.cis.dao.model.Machine;
import com.cis.dao.model.Supplier;

public class SupplierDAOImpl implements SupplierDAO{
	private HibernateTemplate ht;
	
	public SupplierDAOImpl( HibernateTemplate ht){
		this.ht = ht;
	}

	@Override
	public Integer saveSupplier(Supplier supplier) {
		// TODO Auto-generated method stub
		Integer no=(Integer)ht.save(supplier);
		return null;
	}

	@Override
	public List<Supplier> getAllSupplier() {
		// TODO Auto-generated method stub
		 return ht.find("from Supplier");
	}

	@Override
	public Supplier getSupplier(Integer supplier_No) {
		// TODO Auto-generated method stub
		return (Supplier)ht.get(Supplier.class, supplier_No);
	}

	
	public void deleteSupplier(Integer supplier_No) {
		// TODO Auto-generated method stub
		ht.delete(getSupplier(supplier_No));
	}

	@Override
	public void updateSupplier(Supplier supplier_No) {
		// TODO Auto-generated method stub
		ht.update(supplier_No);
		
	}
}