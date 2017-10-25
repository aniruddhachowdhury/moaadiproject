<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
	<form:form commandName="editSupplier" method="post" action="editsupplier.htm">
		<table>
		 <tr>
			<td>Region :  </td>
			<td><form:select path="region">
			         <form:option value="">""Select"</form:option>
                    <form:option value="Saudi">Saudi</form:option>
                   <form:option value="India">India</form:option>
                    </form:select>
                </td>
	    </tr>
		<tr>
			<td>Supplier Id :  </td>
			<td><form:input path="supplier_ID"/></td>
		</tr>
		
	          <td>Supplier Name :</td>
              <td><form:input path="supplier_Name"/></td>
	    </tr>
	    <tr>
	          <td>Email :</td>
              <td><form:input path="supplier_email"/></td>
	    </tr>
	     
		<form:hidden path="supplier_No"/>
			<td colspan="2"><input type="submit" value="Update"/></td>
		</tr>
		</table>
	</form:form>