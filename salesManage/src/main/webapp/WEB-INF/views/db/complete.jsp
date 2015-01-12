<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page session="false" %>
<!DOCTYPE html>
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
			<c:import url="../header.jsp" />
			<hr />
			
			<div class="uk-margin">
				<h2>
					${name}の${form}が完了しました。
				</h2>
				
				<a href="../../">
					TOPへ戻る
				</a>
			</div>
			
			<hr />
			<c:import url="../footer.jsp" />
		</div>
	</body>
</html>
