<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String uname;
String pwd;
String hobby;
uname = request.getParameter("uname");
pwd = request.getParameter("pwd");
hobby = request.getParameter("hobby1");
%>
<%="user's name is : "+uname+"<br/>"+"user's password: "+pwd+"<br/>"+"user's hobby is : "+hobby %>

<%
if(uname.equals("hoover") && pwd.equals("secrect"))
{
	//out.print("the user and passwold is correct. please enter!");
	//dispatch
	request.getRequestDispatcher("success.jsp").forward(request,response);
}
%>
</body>
</html>