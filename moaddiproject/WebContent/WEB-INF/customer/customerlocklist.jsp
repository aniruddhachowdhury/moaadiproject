<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<fieldset>
	<legend>Customer Buy Page Without Barcode</legend>
	<table>
	<%-- <tr>
		<td>Lock ID:</td>
		<td>${requestScope.supplierPages.lockId}</td>
		</tr> --%>
		
		<tr>
			<td>
				<%-- <spring:message code="machineId"/> --%>
				Lock ID
			</td>
		</tr>
		
		<c:forEach items="${requestScope.locks}" var="lock">
			<tr>
				<td>
					<c:out value="${lock.lockID}"/>
				</td>
				
				<td>
				<a href="customerpage.htm?lockID=${lock.lockID}">Buy</a> 
				</td>
			</tr>
		</c:forEach>
	</table>
</fieldset> 
