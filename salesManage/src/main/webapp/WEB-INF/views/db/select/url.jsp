<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false" %>
<html>
<head>
	<title>${title}</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="<c:url value="/resources/css/addons/uikit.gradient.addons.min.css" />">
    <link rel="stylesheet" href="<c:url value="/resources/css/uikit.gradient.min.css" />">
    <link rel="stylesheet" href="<c:url value="/resources/css/uikit.min.css" />">
    <script src="<c:url value="/resources/js/uikit.js" />"></script>
</head>
<body>

<div class="uk-container uk-container-center">

<c:import url="../../header.jsp" />

<hr />
<div class="uk-margin">
<table class="uk-table uk-table-striped uk-table-hover">
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
</div>
<hr />

<c:import url="../../footer.jsp" />

</div>

</body>
</html>
