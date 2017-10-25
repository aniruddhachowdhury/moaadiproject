<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>	
<html>
<head>
<script type ="text/javascript">
function validate(formObj){
var valid= true;
if(formObj.machineId.value==""){

valid=false;
alert("Please Enter Machine ID");

}
return valid;

}

</script>
</head>

<body>


<form:form commandName="addMachine" method="post" onsubmit="return validate(this);">
		<tr>
			<td>Machine Id</td>
			<td><form:input path="machineId"/></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="Submit"/></td>
		</tr>
	</form:form>
</body>

</html>	
	