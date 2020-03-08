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
String name=request.getParameter("uname");
String pwd = request.getParameter("upwd");
if(name.equals("zs") && pwd.equals("abc"))
{
	//重定向可能会导致数据丢失
	//response.sendRedirect("loginSuccess.jsp");
	//请求转发
	request.getRequestDispatcher("loginSuccess.jsp").forward(request,response);
}
else
{
	out.print("用户名或者密码有误！");
}
%>
</body>
</html>