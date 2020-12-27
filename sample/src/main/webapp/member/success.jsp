<%@ page language="java" contentType="text/html; charset=BIG5"
	pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<%
	String user = (String) session.getAttribute("USER");
if (user == null)
	response.sendRedirect("../message.html");
%>
<body>
	<h1>登入成功</h1>
</body>
</html>