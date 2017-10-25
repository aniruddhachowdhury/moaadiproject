<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
	<form:form commandName="edititem" method="post" action="edititem.htm">
	<table>
		<tr>
			<td>Item Id :  </td>
			<td><form:input path="itemId"/></td>
		</tr>
		<tr>
			<td>Type :  </td>
			<td><form:select path="type">
			         <form:option value="">Select</form:option>
                    <form:option value="softdrinks">Soft Drinks</form:option>
                   <form:option value="chips">Chips</form:option>
                   <form:option value="toys">Toys</form:option>
                    </form:select>
                </td>
	    </tr> 
	    <tr> 
	          <td>Product Name :</td>
              <td><form:input path="productName"/></td>
	    </tr>
	         
	       <tr>
	          <td>Product Specification :</td>
              <td><form:textarea path="productSpec"/></td>
	    </tr>
	
		<form:hidden path="itemNo"/>
			<td colspan="2"><input type="submit" value="Update"/></td>
		</tr>
		</table>
	</form:form>