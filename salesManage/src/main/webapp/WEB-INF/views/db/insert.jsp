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
		<c:import url="../header.jsp" />
		
		<hr />
		<div class="uk-margin">
			<h2>
				${name}
			</h2>
			
			<form:form modelAttribute="user" action="insert/complete" method="get" cssClass="uk-form uk-margin" >
				<p>
					<%-- idがString型なのは、int型だと初期値「0」がvalueに入るため --%>
					ID:<form:input path="id" value="" class="uk-form" />
				</p>
				
				<p>
					名前:<form:input path="name" value="" class="uk-form" />
				</p>
				
				<input type="submit" value="登録" class="uk-button">
			</form:form>
		</div>
		<hr />
		
		<c:import url="../footer.jsp" />
	</div>
</body>
</html>
