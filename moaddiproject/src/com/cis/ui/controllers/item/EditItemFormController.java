package com.cis.ui.controllers.item;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;
import com.cis.service.ItemService;
import com.cis.service.beans.ItemBean;

public class EditItemFormController extends SimpleFormController{
	private ItemService itemService;
		public void setItemService(ItemService itemService) {
		this.itemService = itemService;
	}

	public ModelAndView onSubmit(HttpServletRequest request,HttpServletResponse response,Object command,BindException e)throws Exception
	{
		System.out.println("post");
		ItemForm itemForm=(ItemForm)command;
		ItemBean itemBean=new ItemBean();
		itemBean.setItemNo(itemForm.getItemNo());
		itemBean.setItemId(itemForm.getItemId());
		itemBean.setProductName(itemForm.getProductName());
		itemBean.setProductSpec(itemForm.getProductSpec());
		itemBean.setType(itemForm.getType());
		itemService.modifyItem(itemBean);
		return new ModelAndView("redirect:itemlist.htm");
	}

	public Object formBackingObject(HttpServletRequest request)throws Exception
	{
		String itemNo=request.getParameter("itemNo");
		ItemBean itemBean=itemService.getItem(new Integer(itemNo));
		ItemForm itemForm=new ItemForm();
		itemForm.setItemNo(itemBean.getItemNo());
		itemForm.setItemId(itemBean.getItemId());
		itemForm.setProductName(itemBean.getProductName());
		itemForm.setType(itemBean.getType());
		itemForm.setProductSpec(itemBean.getProductSpec());
		return itemForm;
		
	}

}
