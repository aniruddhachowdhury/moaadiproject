<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<fieldset>
	<legend>Supplier Details</legend>
	<table>
	<%-- <tr>
		<td>Lock ID:</td>
		<td>${requestScope.supplierPages.lockId}</td>
		</tr> --%>
		<tr>
			<td colspan="1">
				<a href="insertsupplier.htm">Register Supplier</a>
				 
				<%--  <a href="supplierpage.htm?lockId=${requestScope.supplierPages.lockId}">checkItem</a>   --%>
			</td>
		</tr>
		<tr>
			<td>
				<%-- <spring:message code="machineId"/> --%>
				Supplier ID
			</td>
			<td>
				<%-- <spring:message code="machineId"/> --%>
				Supplier Name
			</td>
		</tr>
		
		<c:forEach items="${requestScope.suppliers}" var="supplier">
			<tr>
				<td>
					<c:out value="${supplier.supplier_ID}"/>
				</td>
				<td>
					<c:out value="${supplier.supplier_Name}"/>
				</td>
				
				<td>
				<a href="viewsupplier.htm?supplier_No=${supplier.supplier_No}">View</a>
				<a href="supplierlock.htm">Approve</a>   
				 
				</td>
			</tr>
		</c:forEach>
	</table>
</fieldset> 
