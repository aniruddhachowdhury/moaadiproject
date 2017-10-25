<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<fieldset>
	<legend>Item Details</legend>
	<table>
		<tr>
		<td>Item ID:</td>
		<td>${requestScope.items.itemId}</td>
		</tr>
		<tr>
		<td>Item Type:</td>
		<td>${requestScope.items.type}</td>
		</tr>
		<tr>
		<td>Name:</td>
		<td>${requestScope.items.productName}</td>
		</tr>
		<tr>
		<td>Ingridents:</td>
		<td>${requestScope.items.productSpec}</td>
		</tr>
		<tr>
			<td colspan="2">
				<a href="edititem.htm?itemNo=${requestScope.items.itemNo}">Edit</a>
				<a href="delitem.htm?itemNo=${requestScope.items.itemNo}">Delete</a>
			</td>
		</tr>
	</table>
</fieldset> 