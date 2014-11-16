<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false" %>
<html>
<head>
	<title><spring:eval expression="@applicationProperties.getProperty('link.top')" /> </title>
</head>
<body>
<h1>
	<spring:eval expression="@applicationProperties.getProperty('top.head')" /> 
</h1>

<ul>
	<li>
		<a href="<c:url value="/db/select" />">
			<spring:eval expression="@applicationProperties.getProperty('link.sel')" /> 
		</a>
	</li>
	<li>
		<spring:eval expression="@applicationProperties.getProperty('link.ins')" /> 
	</li>
	<li>
		<spring:eval expression="@applicationProperties.getProperty('link.upd')" /> 
	</li>
	<li>
		<spring:eval expression="@applicationProperties.getProperty('link.del')" /> 
	</li>
</ul>
</body>
</html>
