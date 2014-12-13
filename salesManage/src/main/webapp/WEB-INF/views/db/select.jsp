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
<h1>
	${title}
</h1>

<ul>
	<li>
		<a href="<c:url value="${all}" />">
			<spring:eval expression="@applicationProperties.getProperty('link.sel.all')" /> 
		</a>
	</li>
	<li>
		
			<a href="<c:url value="${sea}" />">
				<del>
					<spring:eval expression="@applicationProperties.getProperty('link.sel.sea')" /> 
				</del>
			</a>
		
	</li>
	<li>
		<a href="<c:url value="${url}/1" />">
			<spring:eval expression="@applicationProperties.getProperty('link.sel.url')" /> 
		</a>
	</li>
</ul>


</body>
</html>
