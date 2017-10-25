<%@taglib prefix="display" uri="http://displaytag.sf.net" %>
	<a href="addmachine.htm">AddMachine</a>
	<display:table name="${requestScope.machines}" requestURI="/machineslist.htm" list="machines" pagesize="2" decorator="com.cis.ui.decorator.MachineDecorator">
		<display:column property="machineId" title="Machine ID" sortable="true"/>
		<<display:column property="delete"></display:column>
		<display:column property="edit"></display:column>
	 
	</display:table> 
<%-- <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<fieldset>
	<legend>MachineDetails</legend>
	<table>
		<tr>
			<td colspan="1">
				<a href="addmachine.htm">AddMachine</a>
			</td>
		</tr>
		<tr>
			<td>
				<spring:message code="machineId"/>
				MachineId:
			</td>
		</tr>
		
		<c:forEach items="${requsetScope.machines}" var="machine">
			<tr>
				<td>
					<c:out value="${machine.machineId}"/>
				</td>
				<td>
					<a href="machine.htm?mid=${machine.machineId}">View</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</fieldset> --%>


