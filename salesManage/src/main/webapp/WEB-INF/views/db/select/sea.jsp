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

<c:import url="../../header.jsp" />

<hr />

<table border=1>
	<tr>
		<td>ID</td>
		<td>NAME</td>
	</tr>
	<c:forEach var="obj" items="${test}" varStatus="status">
		<tr>
			<td>
				<c:out value="${obj.id}" />
			</td>
			<td>
				<c:out value="${obj.name}" />
			</td>
		</tr>
	</c:forEach>
</table>

<hr />

<c:import url="../../footer.jsp" />

</body>
</html>
