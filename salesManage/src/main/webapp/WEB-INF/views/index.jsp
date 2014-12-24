<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false" %>
<html>
<head>
	<title> ${title} </title>
</head>
<body>
<h1>
	${title}
</h1>

<ul>
	<li>
		<a href="<c:url value="${select}" />">
			<spring:eval expression="@applicationProperties.getProperty('link.sel')" /> 
		</a>
	</li>
	<li>
		<a href="<c:url value="${insert}" />">
			<spring:eval expression="@applicationProperties.getProperty('link.ins')" />
		</a>
	</li>
	<li>
		<a href="<c:url value="${update}/1" />">
			<spring:eval expression="@applicationProperties.getProperty('link.upd')" /> 
		</a>
	</li>
	<li>
		<a href="<c:url value="${delete}" />">
			<spring:eval expression="@applicationProperties.getProperty('link.del')" /> 
		</a>
	</li>
</ul>
</body>
</html>
