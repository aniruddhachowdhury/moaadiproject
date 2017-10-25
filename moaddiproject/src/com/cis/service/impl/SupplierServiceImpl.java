package com.cis.service.impl;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import com.cis.dao.SupplierDAO;
import com.cis.dao.model.Lock1;
import com.cis.dao.model.Machine;
import com.cis.dao.model.Supplier;
import com.cis.service.SupplierService;
import com.cis.service.beans.LockBean;
import com.cis.service.beans.SupplierBean;


public class SupplierServiceImpl implements SupplierService {
	private SupplierDAO supplierDAO;
	
    public SupplierServiceImpl(SupplierDAO supplierDAO) {
		// TODO Auto-generated constructor stub
    	this.supplierDAO =supplierDAO;

}

	@Override
	public Integer saveSupplier(SupplierBean supplierBean) {
		// TODO Auto-generated method stub
		Supplier supplier= new Supplier();
		supplier.setSupplier_ID(supplierBean.getSupplier_ID());
		supplier.setRegion(supplierBean.getRegion());
		supplier.setSupplier_Name(supplierBean.getSupplier_Name());
		supplier.setSupplier_email(supplierBean.getSupplier_email());
		return supplierDAO.saveSupplier(supplier);
	}

	@Override
	public List<SupplierBean> getAllSupplier() {
		
		// TODO Auto-generated method stub
		List<SupplierBean> suppliers=null;
		List<Supplier> lsuppliers=supplierDAO.getAllSupplier();
		if(lsuppliers!=null)
		{
			
			suppliers=new ArrayList<SupplierBean>();
			ListIterator<Supplier> li=lsuppliers.listIterator();
			while(li.hasNext())
			{
				
				Supplier supplier=li.next();
				SupplierBean supplierBean=new SupplierBean();
				supplierBean.setSupplier_No(supplier.getSupplier_No());
				supplierBean.setSupplier_ID(supplier.getSupplier_ID());
				supplierBean.setRegion(supplier.getRegion());
				supplierBean.setSupplier_email(supplier.getSupplier_email());
				supplierBean.setSupplier_Name(supplier.getSupplier_Name());
				suppliers.add(supplierBean);
			}
		}
		
		return suppliers;

		}

	@Override
	public SupplierBean getSupplier(Integer supplier_No) {
		// TODO Auto-generated method stub
		Supplier supplier = supplierDAO.getSupplier(supplier_No);
		SupplierBean supplierBean =null;
		if(supplier!=null)
		{
		    supplierBean = new SupplierBean();
			supplierBean.setSupplier_No(supplier.getSupplier_No());
			supplierBean.setSupplier_ID(supplier.getSupplier_ID());
			supplierBean.setRegion(supplier.getRegion());
			supplierBean.setSupplier_email(supplier.getSupplier_email());
			supplierBean.setSupplier_Name(supplier.getSupplier_Name());
		}
		return supplierBean;
	}

	@Override
	public void modifySupplier(SupplierBean supplierBean) {
		// TODO Auto-generated method stub
		Supplier supplier=new Supplier();
		supplier.setSupplier_No(supplierBean.getSupplier_No());
		supplier.setSupplier_ID(supplierBean.getSupplier_ID());
		supplier.setRegion(supplierBean.getRegion());
		supplier.setSupplier_email(supplierBean.getSupplier_email());
		supplier.setSupplier_Name(supplierBean.getSupplier_Name());
		supplierDAO.updateSupplier(supplier);
	}
}