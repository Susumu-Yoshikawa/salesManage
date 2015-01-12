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
				<form:form modelAttribute="user" action="delete/complete" method="get" cssClass="uk-form uk-margin" >
					<table  class="uk-table uk-table-striped uk-table-hover">
						<tr>
							<td></td>
							<td>ID</td>
							<td>NAME</td>
						</tr>
						<c:forEach var="obj" items="${userall}" varStatus="status">
							<tr>
								<td>
									 <input type="checkbox" id="ids" name="ids" value="<c:out value="${obj.id}"/>">
								</td>
								<td>
									<c:out value="${obj.id}" />
								</td>
								<td>
									<c:out value="${obj.name}" />
								</td>
							</tr>
						</c:forEach>
					</table>
					
					<input type="submit" value="<c:out value="${title}" />" class="uk-button">
					
				</form:form>
			</div>
			
			<hr />
			<c:import url="../footer.jsp" />
		</div>
	</body>
</html>
