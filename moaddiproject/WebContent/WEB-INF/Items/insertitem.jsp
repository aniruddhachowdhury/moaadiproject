<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
 <script type ="text/javascript">
function validate(formObj){
var valid= true;
if(formObj.itemId.value==""){

valid=false;
alert("Please Enter Item ID");

}
return valid;

}

</script> 


</head>

<body>


<form:form commandName="addItem" method="post" onsubmit="return validate(this);"> 
		<table>
		<tr>
			<td>Item Id :  </td>
			<td><form:input path="itemId"/></td>
		</tr>
		<tr>
			<td>Type :  </td>
			<td><form:select path="type">
			         <form:option value="">Select</form:option>
                    <form:option value="softdrinks">Soft Drinks</form:option>
                   <form:option value="chips">Chips</form:option>
                   <form:option value="toys">Toys</form:option>
                    </form:select>
                </td>
	    </tr> 
	    <tr> 
	          <td>Product Name :</td>
              <td><form:input path="productName"/></td>
	    </tr>
	       
	       <tr>
	          <td>Product Specification :</td>
              <td><form:textarea path="productSpec"/></td>
	    </tr>
	    <tr>
			<td colspan="2"><input type="submit" value="Submit"/></td>
		</tr>
	   </table>
 </form:form> 
</body>

</html>	
	