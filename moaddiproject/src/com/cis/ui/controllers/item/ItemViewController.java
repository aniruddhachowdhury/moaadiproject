package com.cis.ui.controllers.item;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.cis.service.AgencyService;
import com.cis.service.ItemService;
import com.cis.service.beans.AgencyBean;
import com.cis.service.beans.ItemBean;

public class ItemViewController implements Controller{
private ItemService itemService;


public void setItemService(ItemService itemService) {
	this.itemService = itemService;
}



	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		ItemBean items=itemService.getItem(new Integer(request.getParameter("itemNo")));
		System.out.println("return controller");
		
		request.setAttribute("items", items);
		
		return new ModelAndView("WEB-INF/Items/view");
	}
}
