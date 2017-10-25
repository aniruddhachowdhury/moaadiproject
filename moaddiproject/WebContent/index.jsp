<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="Moaddi Vending Machines">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
 Moadi Company  <br>
   <!--  <a href="employeelist.htm">Machinelist</a> -->
   <tr>
    <a href="machineslist.htm">Machines</a><br>
  </tr>
    <a href="locklist.htm">Lock </a><br>
    
    <a href="agencyeslist.htm">Agency</a><br>
    
    <a href="supplierlist.htm">Supplier</a><br>
    <a href="itemlist.htm">Item Database</a><br>
    <a href="customerlock.htm">Customer Buy</a>
  </body>
</html>
