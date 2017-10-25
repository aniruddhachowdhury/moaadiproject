package com.cis.service.impl;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import com.cis.dao.SupplierPageDAO;
import com.cis.dao.model.Machine;
import com.cis.dao.model.SupplierPage;
import com.cis.service.SupplierPageService;
import com.cis.service.beans.MachineBean;
import com.cis.service.beans.SupplierPageBean;



public class SupplierPageServiceImpl implements SupplierPageService {
	
	private SupplierPageDAO supplierPageDAO;
	public SupplierPageServiceImpl(SupplierPageDAO supplierPageDAO)
	{
		this.supplierPageDAO = supplierPageDAO;
	}

	@Override
	public Integer saveSupplierPage(SupplierPageBean supplierPageBean) {
		SupplierPage supplierPage = new SupplierPage();
		supplierPage.setLockId(supplierPageBean.getLockId());
		supplierPage.setProductName(supplierPageBean.getProductName());
     	supplierPage.setPrice(supplierPageBean.getPrice());
		supplierPage.setPassword(supplierPageBean.getPassword());
		return supplierPageDAO.savePassword(supplierPage);
	}

	@Override
	public List<SupplierPageBean> getAllSupplierPageBeans() {
		List<SupplierPageBean> suppliers=null;
		List<SupplierPage> lsuppliers=supplierPageDAO.getAllSupplierPage();
		if(lsuppliers!=null)
		{
			suppliers=new ArrayList<SupplierPageBean>();
			ListIterator<SupplierPage> li=lsuppliers.listIterator();
			while(li.hasNext())
			{
				SupplierPage supplierPage=li.next();
				SupplierPageBean supplierPageBean=new SupplierPageBean();
				supplierPageBean.setLockId(supplierPage.getLockId());
				supplierPageBean.setPassword(supplierPage.getPassword());
				System.out.println("In service Layer"+supplierPage.getPassword());
				supplierPageBean.setProductName(supplierPage.getProductName());
				supplierPageBean.setPrice(supplierPage.getPrice());
				suppliers.add(supplierPageBean);
			}
		}
		
		return suppliers;
	}

	@Override
	public SupplierPageBean getSupplierPageBean(Integer lockId) {
		// TODO Auto-generated method stub
         SupplierPage supplierPage=supplierPageDAO.getSupplierPage(lockId);
         SupplierPageBean supplierPageBean=null;
		if(supplierPage!=null)
		{
			supplierPageBean=new SupplierPageBean();
			supplierPageBean.setLockId(supplierPage.getLockId());
			supplierPageBean.setProductName(supplierPage.getProductName());
			supplierPageBean.setPrice(supplierPage.getPrice());
			supplierPageBean.setPassword(supplierPage.getPassword());
			System.out.println("Password in service layer:  "+supplierPage.getPassword()  );
		
		}
		return supplierPageBean;
		
	}

	@Override
	public void modifySupplier(SupplierPageBean supplierPageBean) {
		// TODO Auto-generated method stub
		
		SupplierPage supplierPage=new SupplierPage();
		supplierPage.setLockId(supplierPageBean.getLockId());
		supplierPage.setPassword(supplierPageBean.getPassword());
		supplierPage.setPrice(supplierPageBean.getPrice());
		supplierPage.setProductName(supplierPageBean.getProductName());
		supplierPageDAO.updateItems(supplierPage);
		
	}

}