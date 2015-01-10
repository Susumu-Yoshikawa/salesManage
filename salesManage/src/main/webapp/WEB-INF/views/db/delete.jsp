<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false" %>
<html>
<head>
	<title>${title}</title>
</head>
<body>

<c:import url="../header.jsp" />

<hr />

<form:form modelAttribute="user" action="delete/complete" method="get">
	<table border=1>
		<tr>
			<td></td>
			<td>ID</td>
			<td>NAME</td>
		</tr>
		<c:forEach var="obj" items="${userall}" varStatus="status">
			<tr>
				<td>
					 <input type="checkbox" id="ids" name="ids" value="<c:out value="${obj.id}"/>">
				</td>
				<td>
					<c:out value="${obj.id}" />
				</td>
				<td>
					<c:out value="${obj.name}" />
				</td>
			</tr>
		</c:forEach>
	</table>
	
	<input type="submit" value="削除">
	
</form:form>
<hr />

<c:import url="../footer.jsp" />

</body>
</html>
