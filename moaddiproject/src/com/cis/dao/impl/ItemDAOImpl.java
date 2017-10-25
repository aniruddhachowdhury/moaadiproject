package com.cis.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

import com.cis.dao.ItemDAO;
import com.cis.dao.model.Agency;
import com.cis.dao.model.Item;

public class ItemDAOImpl implements ItemDAO {
   private HibernateTemplate ht;
   public ItemDAOImpl(HibernateTemplate ht) {
	   this.ht = ht;
	// TODO Auto-generated constructor stub
}
	@Override
	public Integer saveItem(Item item) {
		Integer itemId =(Integer)ht.save(item);
		return itemId;					
	}

	@Override
	public List<Item> getItems() {
		return ht.find("from Item");
	}

	@Override
	public Item getItem(Integer itemNo) {
		// TODO Auto-generated method stub
		return (Item)ht.get(Item.class, itemNo);
	
	}

	@Override
	public void deleteItem(Integer itemNo) {
		// TODO Auto-generated method stub
		ht.delete(getItem(itemNo));
	}

	@Override
	public void updateItem(Item itemNo) {
		// TODO Auto-generated method stub
		ht.update(itemNo);
	}

}
