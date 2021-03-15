<%@page import="com.bean.CourseBean"%>
<%@page import="java.util.List"%>
<%@page import="com.dao.CourseDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="addStudentController" method="post">
		<table>
			<tr>
				<td>ENTER STUDENT NAME</td>
				<td><input type="text" name="txtStudentName"></td>
			</tr>

			<tr>
				<td>ENTER STUDENT EMAIL</td>
				<td><input type="text" name="txtStudentEmail"></td>
			</tr>
			<tr>
				<td>ENTER STUDENT PASSWORD</td>
				<td><input type="password" name="pwdStudentPassword"></td>
			</tr>
			<tr>
				<td>ENTER STUDENT AGE</td>
				<td><input type="text" name="txtStudentAge"></td>
			</tr>

			<tr>
				<td>ENTER STUDENT BIRTHDATE</td>
				<td><input type="date" name="txtStudentDate"></td>
			</tr>
			<tr>
				<td><select name="course">
						<option value="0">SELECT COURSE</option>
						<%
						CourseDao courseDao = new CourseDao();
						List<CourseBean> courseList = courseDao.getAllCourses();
						for (int i = 0; i < courseList.size(); i++) {
							CourseBean courseBean = courseList.get(i);
						%>
						<option value="<%=courseBean.getcId()%>"><%=courseBean.getcName()%></option>
						<%
						}
						%>
				</select></td>


			</tr>
			<tr>
				<td><input type="submit" value="SUBMIT"></td>
			</tr>

		</table>

	</form>
</body>
</html>