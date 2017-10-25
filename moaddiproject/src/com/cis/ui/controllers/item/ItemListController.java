package com.cis.ui.controllers.item;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.cis.service.ItemService;
import com.cis.service.MachineService;
import com.cis.service.beans.ItemBean;
import com.cis.service.beans.MachineBean;

public class ItemListController implements Controller{
	private ItemService itemService;


	public void setItemService(ItemService itemService) {
		this.itemService = itemService;
	}



	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		List<ItemBean> items=itemService.getAllItems();
		
		request.setAttribute("items",items);
		
		return new ModelAndView("WEB-INF/Items/itemlist");
		
	}
}
