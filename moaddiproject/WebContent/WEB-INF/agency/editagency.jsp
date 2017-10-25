<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
	<form:form commandName="editagency" method="post" action="editagency.htm">
		<tr>
			<td>Agency ID</td>
			<td><form:input path="agencyId"/></td>
		</tr>
	    <tr>
			<td>Region</td>
			<td><form:select path="region">
			         <form:option value="Select">SAUDI</form:option>
                    <form:option value="SAUDI">SAUDI</form:option>
                   <form:option value="INDIA">INDIA</form:option>
                    </form:select>
                </td>
		</tr>
		<tr>
		<form:hidden path="agency_No"/>
			<td colspan="2"><input type="submit" value="Update"/></td>
		</tr>
	</form:form>