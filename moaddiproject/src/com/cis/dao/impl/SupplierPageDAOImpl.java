package com.cis.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.cis.dao.SupplierPageDAO;
import com.cis.dao.model.SupplierPage;

public class SupplierPageDAOImpl implements SupplierPageDAO{
           private HibernateTemplate ht;
      public  SupplierPageDAOImpl(HibernateTemplate ht) {
    	  this.ht=ht;
		// TODO Auto-generated constructor stub
	}
	@Override
	public Integer savePassword(SupplierPage supplierpage) {
		// TODO Auto-generated method stub
		Integer lockId= (Integer)ht.save(supplierpage);
		return lockId;
	}

	@Override
	public List<SupplierPage> getAllSupplierPage() {
		// TODO Auto-generated method stub
		return ht.find("from supplierpage");
	}

	@Override
	public SupplierPage getSupplierPage(Integer lockId) {
		// TODO Auto-generated method stub
		return (SupplierPage)ht.get(SupplierPage.class, lockId);
	}
	@Override
	public void updateItems(SupplierPage supplierPage) {
		// TODO Auto-generated method stub
		ht.update(supplierPage);
	}

}
