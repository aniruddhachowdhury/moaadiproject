package com.cis.ui.decorator;

import org.displaytag.decorator.TableDecorator;


import com.cis.service.beans.LockBean;


public class LockDecorator extends TableDecorator
{
	public String getDelete()
	{
		LockBean currentRow=(LockBean)this.getCurrentRowObject();
		return "<a href='dellock.htm?lockNo="+currentRow.getLockNo()+"'>Delete</a>";
		
	}
	public String getEdit()
	{
		LockBean currentRow=(LockBean)this.getCurrentRowObject();
		return "<a href='editlock.htm?lockNo="+currentRow.getLockNo()+"'>Edit</a>";
	}
}
