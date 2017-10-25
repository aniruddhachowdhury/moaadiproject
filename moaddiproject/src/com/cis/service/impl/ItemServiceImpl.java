package com.cis.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import com.cis.dao.ItemDAO;
import com.cis.dao.model.Item;
import com.cis.dao.model.Machine;
import com.cis.service.ItemService;
import com.cis.service.beans.ItemBean;
import com.cis.service.beans.MachineBean;

public class ItemServiceImpl implements ItemService {
    private ItemDAO itemDAO;
     public ItemServiceImpl(ItemDAO itemDAO) {
    	 this.itemDAO = itemDAO;
		// TODO Auto-generated constructor stub
	}
	@Override
	public Integer saveItem(ItemBean itemBean) {
		Item item=new Item();
		item.setItemId(itemBean.getItemId());
		item.setProductName(itemBean.getProductName());
		item.setType(itemBean.getType());
		item.setProductSpec(itemBean.getProductSpec());
		return itemDAO.saveItem(item);
	}

	@Override
	public List<ItemBean> getAllItems() {
		List<ItemBean> items=null;
		List<Item> litems=itemDAO.getItems();
		if(litems!=null)
		{
			items=new ArrayList<ItemBean>();
			ListIterator<Item> li=litems.listIterator();
			while(li.hasNext())
			{
				Item item=li.next();
				ItemBean itemBean=new ItemBean();
				itemBean.setItemNo(item.getItemNo());
				itemBean.setItemId(item.getItemId());
				itemBean.setProductName(item.getProductName());
				itemBean.setProductSpec(item.getProductName());
				itemBean.setType(item.getType());
				items.add(itemBean);
			}
		}
		
		return items;
	}
	@Override
	public ItemBean getItem(Integer itemNo) {
        Item item=itemDAO.getItem(itemNo);
		
		ItemBean itemBean=null;
		if(item !=null)
		{
			itemBean=new ItemBean();
			itemBean.setItemNo(item.getItemNo());
			itemBean.setItemId(item.getItemId());
			itemBean.setProductName(item.getProductName());
			itemBean.setProductSpec(item.getProductSpec());
			itemBean.setType(item.getType());
		}
		return itemBean;
	}
	@Override
	public void modifyItem(ItemBean itemBean) {
		// TODO Auto-generated method stub
		Item item=new Item();
		item.setItemNo(itemBean.getItemNo());
		item.setItemId(itemBean.getItemId());
		item.setProductName(itemBean.getProductName());
		item.setProductSpec(itemBean.getProductSpec());
		item.setType(itemBean.getType());
		itemDAO.updateItem(item);
	}

}
