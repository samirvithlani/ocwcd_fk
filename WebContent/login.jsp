<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="LoginController">
		<table>
			<tr>
				<td>ENTER EMAIL</td>
				<td><input type="text" name="txtStudentEmail"></td>
			</tr>
			<tr>
				<td>ENTER PASSWORD</td>
				<td><input type="password" name="pwdStudentPassword"></td>
			</tr>
			<tr>

				<td><input type="submit" value="Login"></td>
			</tr>
		</table>
	</form>
</body>
</html>