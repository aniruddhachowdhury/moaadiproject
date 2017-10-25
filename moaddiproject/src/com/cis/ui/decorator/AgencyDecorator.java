package com.cis.ui.decorator;

import com.cis.service.beans.AgencyBean;

import org.displaytag.decorator.TableDecorator;

public class AgencyDecorator extends TableDecorator {
	public String getDelete()
	{
		AgencyBean currentRow=(AgencyBean)this.getCurrentRowObject();
		return "<a href='delmachine.htm?agency_No="+currentRow.getAgency_No()+"'>Delete</a>";
	}
	public String getEdit()
	{
		AgencyBean currentRow=(AgencyBean)this.getCurrentRowObject();
		return "<a href='editmachine.htm?agency_No="+currentRow.getAgency_No()+"'>Edit</a>";
	}

}
