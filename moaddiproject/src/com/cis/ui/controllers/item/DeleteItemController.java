package com.cis.ui.controllers.item;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.cis.dao.ItemDAO;

public class DeleteItemController implements Controller {
	
		 private ItemDAO itemDAO;
		 public ItemDAO getItemDAO() {
			return itemDAO;
		}
		public void setItemDAO(ItemDAO itemDAO) {
			this.itemDAO = itemDAO;
		}
		@Override
		 public ModelAndView handleRequest(HttpServletRequest request,
		 		HttpServletResponse response) throws Exception {
		 	// TODO Auto-generated method stub
		 	String itemNo=request.getParameter("itemNo");
		  // System.out.println(machineNo);
		 	itemDAO.deleteItem(new Integer(itemNo));
		 	return new ModelAndView("redirect:itemlist.htm");
		 }

}
