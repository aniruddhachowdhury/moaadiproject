<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>	
<html>
<head>
<script type ="text/javascript">
function validate(formObj){
var valid= true;
if(formObj.lockID.value==""){

valid=false;
alert("Please Enter Lock ID");

}
return valid;

}

</script>
</head>

<body>


<form:form commandName="addLock" method="post" onsubmit="return validate(this);">
		<tr>
			<td>Lock Id</td>
			<td><form:input path="lockID"/></td>
	    </tr>
	    <tr>
	    	<td colspan="2"><input type="submit" value="Add"/></td>
		</tr>
	</form:form>
	
            
            
         
</body>

</html>	
	