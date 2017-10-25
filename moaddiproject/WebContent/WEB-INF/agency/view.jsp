<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<fieldset>
	<legend>AgencyDetails</legend>
	<table>
		<tr>
		<td>AgencyId:</td>
		<td>${requestScope.agency.agencyId}</td>
		</tr>
		<tr>
			<td colspan="2">
				<a href="editagency.htm?agency_No=${requestScope.agency.agency_No}">Edit</a>
				<a href="delagency.htm?agency_No=${requestScope.agency.agency_No}">Delete</a>
			</td>
		</tr>
	</table>
</fieldset> 