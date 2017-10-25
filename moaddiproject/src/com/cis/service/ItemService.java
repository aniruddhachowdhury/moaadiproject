package com.cis.service;

import java.util.List;

import com.cis.service.beans.ItemBean;;

public interface ItemService {
	public Integer saveItem(ItemBean itemBean);
	public List<ItemBean> getAllItems();
	public ItemBean getItem(Integer itemNo);
	public void modifyItem(ItemBean itemBean);
	
}
