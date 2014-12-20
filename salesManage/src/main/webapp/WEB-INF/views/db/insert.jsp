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

<form:form modelAttribute="user" action="insert/insert" method="get">
	<p>
		ID:<form:input path="id" />
	</p>
	
	<p>
		名前:<form:input path="name" />
	</p>
	
	<input type="submit" value="送信">
</form:form>

</body>
</html>
