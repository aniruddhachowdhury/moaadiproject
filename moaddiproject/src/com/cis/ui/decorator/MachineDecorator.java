package com.cis.ui.decorator;

import org.displaytag.decorator.TableDecorator;


import com.cis.service.beans.MachineBean;


public class MachineDecorator extends TableDecorator
{
	public String getDelete()
	{
		MachineBean currentRow=(MachineBean)this.getCurrentRowObject();
		return "<a href='delmachine.htm?machineNo="+currentRow.getMachineNo()+"'>Delete</a>";
	}
	public String getEdit()
	{
		MachineBean currentRow=(MachineBean)this.getCurrentRowObject();
		return "<a href='editmachine.htm?machineNo="+currentRow.getMachineNo()+"'>Edit</a>";
	}
}
