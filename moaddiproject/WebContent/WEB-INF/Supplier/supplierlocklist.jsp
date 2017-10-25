<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<fieldset>
	<legend>SupplierLock Details</legend>
	<table>
	<%-- <tr>
		<td>Lock ID:</td>
		<td>${requestScope.supplierPages.lockId}</td>
		</tr> --%>
		<tr>
		<td>
		<a href="supplierhistorylist.htm">History</a>
		</td>
		</tr>
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
				<a href="supplierpage.htm?lockID=${lock.lockID}">InsertItems</a> 
				</td>
			</tr>
		</c:forEach>
	</table>
</fieldset> 
