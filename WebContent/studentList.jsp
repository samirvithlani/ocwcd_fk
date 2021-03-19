<%@page import="java.util.ArrayList"%>
<%@page import="com.bean.StudentBean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table>
		<tr>
			<th>STUDENT NAME</th>
			<th>STUDENT EMAIL</th>
			<th>STUDENT COURSE</th>
			<th>COURSE FEE</th>
		</tr>
		<%
		List<StudentBean> studentlList = (ArrayList<StudentBean>) request.getAttribute("studentList");
		for (int i = 0; i < studentlList.size(); i++) {

			StudentBean studentBean = studentlList.get(i);
		%>

		<tr>
			<td><%=studentBean.getsName()%></td>
			<td><%=studentBean.getsEmail()%></td>
			<td><%=studentBean.getcName()%></td>
			<td><%=studentBean.getcFee()%></td>
		</tr>


		<%
		}
		%>


	</table>
</body>
</html>