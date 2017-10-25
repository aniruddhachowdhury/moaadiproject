<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Supplier Page</title>
</head>
<body>
<form:form commandName="customerPage" method="post" onsubmit="return validate(this);"> 
		<table>
		<tr>
			<td>Lock Id :  </td>
			<td><form:input path="lockId"/></td>
	    </tr> 
		<tr>
			<td>Product Name :  </td>
			<td><form:input path="productName"/></td>
		</tr>
		<tr>
	          <td>Product Price:</td>
              <td><form:input path="price"/></td>
	    </tr>
	    <tr>
	          <td>Password:</td>
              <td><form:input path="password"/></td>
	    </tr>
	    
	    <!-- <tr>
			<td colspan="2"><input type="submit" value="GeneratePassword"/></td>
		</tr> -->
	   </table>
 </form:form> 
</body>
</html>