<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
	<form:form commandName="editMachine" method="post" >
		<tr>
			<td>machineId</td>
			<td><form:input path="machineId"/></td>
		</tr>
		<tr>
		<form:hidden path="machineNo"/>
			<td colspan="2"><input type="submit" value="Update"/></td>
		</tr>
	</form:form>
	