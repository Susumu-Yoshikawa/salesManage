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
	${name}の${form}が完了しました。
</h2>

<a href="../..//">
	TOPへ戻る
</a>

<hr />

<c:import url="../footer.jsp" />

</body>
</html>
