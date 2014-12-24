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

<table border=1>
	<tr>
		<td>ID</td>
		<td>NAME</td>
	</tr>
		<tr>
			<td>
				<c:out value="${test.id}" />
			</td>
			<td>
				<c:out value="${test.name}" />
			</td>
		</tr>
</table>

<h3>
URLの「/url/」の後ろの値を任意に変えてください。
<br />
その値をキーにuserテーブルから検索しています。
</h3>

</body>
</html>
