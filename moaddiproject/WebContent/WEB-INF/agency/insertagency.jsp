<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
 <script type ="text/javascript">
function validate(formObj){
var valid= true;
if(formObj.agencyID.value==""){

valid=false;
alert("Please Enter Agency ID");

}
return valid;

}
$(function() {
    $('#idDateField').datepicker();
});
</script> 


</head>

<body>


<form:form commandName="addAgency" method="post" onsubmit="return validate(this);"> 
		<table>
		<tr>
			<td>Region :  </td>
			<td><form:select path="region">
			         <form:option value=""></form:option>
                    <form:option value="Saudi">Saudi</form:option>
                   <form:option value="India">India</form:option>
                    </form:select>
                </td>
	    </tr> 
		<tr>
			<td>Agency Id :  </td>
			<td><form:input path="agencyId"/></td>
		</tr>
		
	    <tr>
	 <%--    <td>Date</td>
            <td><form:input id="idDateField" path="date"/>
        </tr>
	     --%>
	    <tr> 
	          <td>Password :</td>
              <td><form:password path="password"/></td>
	    </tr>
	    <tr>
	          <td>Email :</td>
              <td><form:input path="email"/></td>
	    </tr>
	     
	    <tr>
			<td colspan="2"><input type="submit" value="Submit"/></td>
		</tr>
	   </table>
 </form:form> 
</body>

</html>	
	