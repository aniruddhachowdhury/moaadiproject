<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
	<form:form commandName="editLock" method="post" action="editlock.htm">
		<tr>
			<td>lockId</td>
			<td><form:input path="lockID"/></td>
		</tr>
	
		<tr>
		<form:hidden path="lockNo"/>
			<td colspan="2"><input type="submit" value="Update"/></td>
		</tr>
	</form:form>
	