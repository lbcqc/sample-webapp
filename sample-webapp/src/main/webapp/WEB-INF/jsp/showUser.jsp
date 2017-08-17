<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	</br>
	</br>
	<table border="1" cellspacing="0" align="center" width = "400">
		<tr>
			<th colspan="2">用户信息</th>
		</tr>
		<tr>
			<th>id</th>
			<th>${user.id}</th>
		</tr>
		<tr>
			<th>name</th>
			<th>${user.userName}</th>
		</tr>
		<tr>
			<th>age</th> 
			<th>${user.age}</th>
		</tr>
	</table>
</body>
</html>