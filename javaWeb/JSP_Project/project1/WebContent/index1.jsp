<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Hello world!</title>
</head>
<body>
	hello,index1 你好！
	<%! public String bookname;
		public void init(){
			bookname="java web";
		}%>
	<%
		String name="zhangsan";
		out.print("hello"+name);
		init();
	%>
	<%="hello "+bookname %>
	
	<form action="show.jsp" method="get">
	  <p>First name: <input type="text" name="fname" /></p>
	  <p>Last name: <input type="text" name="lname" /></p>
	  <input type="submit" value="Submit" />
	</form>
</body>
</html>