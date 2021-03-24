<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<c:set var="greet" value="${2 }"></c:set>
	value =
	<c:out value="${greet }"></c:out>
	<c:choose>
		<c:when test="${greet>=12 }">
			<c:out value="good after noon"></c:out>
		</c:when>

		<c:when test="${greet<12 }">
			<c:out value="good morning"></c:out>
		</c:when>
		<c:otherwise>
			<c:out value="good night"></c:out>
		</c:otherwise>


	</c:choose>


</body>
</html>