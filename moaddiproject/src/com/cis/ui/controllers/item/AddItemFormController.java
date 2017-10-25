package com.cis.ui.controllers.item;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.cis.service.ItemService;
import com.cis.service.beans.ItemBean;



public class AddItemFormController extends SimpleFormController {
	
	private ItemService itemService;

	public void setItemService(ItemService itemService) {
		this.itemService = itemService;
	}
	public ModelAndView onSubmit(HttpServletRequest request,HttpServletResponse response,Object command,BindException e)throws Exception
	{
		ItemForm itemForm=(ItemForm)command;
		ItemBean itemBean=new ItemBean();
		itemBean.setItemId(itemForm.getItemId());
		itemBean.setProductName(itemForm.getProductName());
		itemBean.setProductSpec(itemForm.getProductSpec());
		itemBean.setType(itemForm.getType());
		itemService.saveItem(itemBean);
		return new ModelAndView("redirect:itemlist.htm");
	  /*return new ModelAndView("redirect:employeelist.htm");*/
	}

}
