<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
 <script type ="text/javascript">
function validate(formObj){

var x=formObj.supplier_email.value;
    var atposition=x.indexOf("@");
    var dotposition=x.lastIndexOf(".");
    var valid= true;
   if(atposition<1 || atposition>dotposition+3 || dotposition+3>=x.length)
	   {
	   valid=false;
	   alert("Please Enter Supplier Email");
	   }

   if(formObj.supplier_ID.value==""){

	   valid=false;
	   alert("Please Enter Supplier ID");

	   }

   if(formObj.supplier_Name.value==""){

	   valid=false;
	   alert("Please Enter Supplier Name");

	   }
   else  if(formObj.region.value=="Select"){

	   valid=false;
	   alert("Please Select Region");

	   }
return valid;
}


</script> 


</head>

<body>


<form:form commandName="addSupplier" method="post" onsubmit="return validate(this);"> 
		<table>
		<tr>
			<td>Region :  </td>
			<td><form:select path="region">
			         <form:option value="">Select</form:option>
                    <form:option value="Saudi">Saudi</form:option>
                   <form:option value="India">India</form:option>
                    </form:select>
                </td>
	    </tr> 
		<tr>
			<td>Supplier Id :  </td>
			<td><form:input path="supplier_ID"/></td>
		</tr>
		
	          <td>Supplier Name :</td>
              <td><form:input path="supplier_Name"/></td>
	    </tr>
	    <tr>
	          <td>Email :</td>
              <td><form:input path="supplier_email"/></td>
	    </tr>
	     
	    <tr>
			<td colspan="2"><input type="submit" value="Submit"/></td>
		</tr>
	   </table>
 </form:form> 
</body>

</html>	
	