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


	<c:forEach var="age" items="${ages }">
		<p>${age }</p>
	</c:forEach>
	<c:forEach var="n" items="${names }">
		<ul>
			<li>${n }</li>
		</ul>

	</c:forEach>
	<table>
		<tr>
			<th>STUDENT NAME</th>
			<th>STUDENT EMAIL</th>
			<th>STUDENT COURSE</th>
			<th>COURSE FEE</th>
		</tr>



		<c:forEach var="studentBean" items="${studentList}">
			<tr>


				<td>${studentBean.sName }</td>
				<td>${studentBean.sEmail }</td>
				<td>${studentBean.cName }</td>
				<td>${studentBean.cFee }</td>
			</tr>
		</c:forEach>


	</table>
</body>
</html>