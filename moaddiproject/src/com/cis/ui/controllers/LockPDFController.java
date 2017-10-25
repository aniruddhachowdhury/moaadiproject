package com.cis.ui.controllers;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.sun.xml.txw2.Document;
public class LockPDFController {
	
	
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
	 
			String output =
				ServletRequestUtils.getStringParameter(request, "output");
	 
			//dummy data
			Map<String,String> revenueData = new HashMap<String,String>();
			revenueData.put("1/20/2010", "$100,000");
			revenueData.put("1/21/2010", "$200,000");
			revenueData.put("1/22/2010", "$300,000");
			revenueData.put("1/23/2010", "$400,000");
			revenueData.put("1/24/2010", "$500,000");
	 
			    return new ModelAndView("PDFView","revenueData",revenueData);
	 
		}	


}
