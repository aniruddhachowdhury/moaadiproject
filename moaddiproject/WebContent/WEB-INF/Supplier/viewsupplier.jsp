<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<fieldset>
	<legend>Supplier Details</legend>
	<table>
		<tr>
		<td>Supplier ID:</td>
		<td>${requestScope.supplier.supplier_ID}</td>
		</tr>
		<tr>
		<td>Supplier Name:</td>
		<td>${requestScope.supplier.supplier_Name}</td>
		</tr>
		<tr>
		<td>Supplier Email:</td>
		<td>${requestScope.supplier.supplier_email}</td>
		</tr>
		<tr>
		<td>Supplier Region:</td>
		<td>${requestScope.supplier.region}</td>
		</tr>
		<tr>
		<td>Credit Balance:</td>
		<td>0</td>
		</tr>
		<tr>
			<td colspan="2">
				 <a href="editsupplier.htm?supplier_No=${requestScope.supplier.supplier_No}">Edit</a>
				 <a href="delsupplier.htm?supplier_No=${requestScope.supplier.supplier_No}">Delete</a>
			 </td>
		</tr>
	</table>
</fieldset> 