<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<fieldset>
	<legend>Item Details</legend>
	<table>
		<tr>
			<td colspan="1">
				<a href="insertitem.htm">New Item</a>
			</td>
		</tr>
		<tr>
			<td>
				<%-- <spring:message code="machineId"/> --%>
				Item ID
			</td>
			<td>
				<%-- <spring:message code="machineId"/> --%>
				Item Name
			</td>
		</tr>
		
		<c:forEach items="${requestScope.items}" var="item">
			<tr>
				<td>
					<c:out value="${item.itemId}"/>
				</td>
				<td>
					<c:out value="${item.productName}"/>
				</td>
				<td>
				<a href="view.htm?itemNo=${item.itemNo}">View</a> 
				 
				</td>
			</tr>
		</c:forEach>
	</table>
</fieldset> 
