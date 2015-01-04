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

<h2>
	${name}
</h2>

<form:form modelAttribute="user" action="insert/complete" method="get">
	<p>
		<%-- idがString型なのは、int型だと初期値「0」がvalueに入るため --%>
		ID:<form:input path="id" value="" />
	</p>
	
	<p>
		名前:<form:input path="name" value="" />
	</p>
	
	<input type="submit" value="登録">
</form:form>

<hr />

<c:import url="../footer.jsp" />

</body>
</html>
