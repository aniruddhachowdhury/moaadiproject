package com.cis.ui.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

import javax.persistence.Table;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractExcelView;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.cis.dao.model.Lock1;
import com.cis.service.beans.LockBean;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.lowagie.text.Document;


public class PDFView  extends AbstractPdfView{
		@Override
	protected void buildPdfDocument(Map model, Document document,
			com.lowagie.text.pdf.PdfWriter writer, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		Map<String,String> revenueData = (Map<String,String>) model.get("revenueData");
	/*	 
		Table table = new Table(2);
		table.addCell("Month");
		table.addCell("Revenue");
 
		for (Map.Entry<String, String> entry : revenueData.entrySet()) {
			table.addCell(entry.getKey());
			table.addCell(entry.getValue());
                }
 
		document.add(table);
		
*/		
	}
	}