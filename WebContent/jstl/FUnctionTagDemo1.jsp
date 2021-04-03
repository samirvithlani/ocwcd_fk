<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:set var="name" value="     harish chandra ram chandra      "></c:set>

	${fn:replace(name,"chandra","chandni") }
	
	<h3>len = ${fn:length(name) }</h3>
	<c:set var="name2" value="${fn:trim(name) }"></c:set>
	<h3>len2 = ${fn:length(name2) }</h3>
	<h3>${name2 }</h3>

	<h1>index = ${fn:indexOf(name,'s') }</h1>
	<c:if test="${fn:contains(name,'chandraa') }">
		<p>Found..</p>
	</c:if>

</body>
</html>