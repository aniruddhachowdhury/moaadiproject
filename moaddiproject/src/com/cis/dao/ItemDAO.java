package com.cis.dao;

import java.util.List;

import com.cis.dao.model.Item;

public interface ItemDAO {
	public Integer saveItem(Item item);
	public List<Item> getItems();
	public Item getItem(Integer itemNo);
	public void deleteItem(Integer itemNo);
	public void updateItem(Item item);

}
