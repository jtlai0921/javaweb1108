<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
<%
	String Name=request.getParameter("name");
	String Pass=request.getParameter("password");
%>

name=<%=Name %><br>
password<%=Pass %>
</body>
</html>