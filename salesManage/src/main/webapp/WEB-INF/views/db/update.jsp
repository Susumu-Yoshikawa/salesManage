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

<form:form modelAttribute="user" action="complete" method="get">
	<p>
		ID:<form:input path="id" value="${userObj.id}" readonly="true"/>
	</p>
	
	<p>
		名前:<form:input path="name" value="${userObj.name}" />
	</p>
	
	<input type="submit" value="更新">
</form:form>

<hr />

<c:import url="../footer.jsp" />

</body>
</html>
