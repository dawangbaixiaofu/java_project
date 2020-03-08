<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	request.setCharacterEncoding("utf-8");
	String fname = request.getParameter("fname");
	String lname=request.getParameter("lname");
	%>
	注册信息如下：
	first name:<%=fname %>
	last name:<%=lname %>
</body>
</html>