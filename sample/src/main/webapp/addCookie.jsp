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
	String userName=request.getParameter("username");

	Cookie c=new Cookie("UserName",userName);
	c.setMaxAge(10);
	response.addCookie(c);

%>
<h3>產生cookie</h3>
<a href="readCookie.jsp">read</a>
</body>
</html>