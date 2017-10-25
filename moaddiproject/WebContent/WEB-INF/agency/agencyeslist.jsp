<%-- <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<fieldset>
	<legend>Agency Details</legend>
	<table>
		<tr>
			<td colspan="1">
				<a href="insertagency.htm">Register Agency</a>
			</td>
		</tr>
		<tr>
			<td>				
				agencyId:
			</td>
			<td>				
				Region:
			</td>
		</tr>
		
		<c:forEach items="${requsetScope.agencies}" var="agencies">
			<tr>
				<td>
					<c:out value="${agencies.agencyId}"/>
				</td>
				<td>
					<c:out value="${agencies.region}"/>
				</td>
				
				<td>
					<a href="agencylist.htm?mid=${agency.agencyId}">View</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</fieldset> --%>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<fieldset>
	<legend>AgencyDetails</legend>
	<table>
		<tr>
			<td colspan="1">
				<a href="insertagency.htm">AddAgency</a>
			</td>
		</tr>
		<tr>
			<td>
				<%-- <spring:message code="machineId"/> --%>
				AgencyId
			</td>
			<td>
				<%-- <spring:message code="machineId"/> --%>
				AgencyRegion
			</td>
		</tr>
		
		<c:forEach items="${requestScope.agencies}" var="agency">
			<tr>
				<td>
					<c:out value="${agency.agencyId}"/>
				</td>
				<td>
					<c:out value="${agency.region}"/>
				</td>
				<td>
				<a href="view.htm?agency_No=${agency.agency_No}">View</a> 
				 
				</td>
			</tr>
		</c:forEach>
	</table>
</fieldset> 
