<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
<!-- test -->
<%
/*
*/
//
out.print("hello jsp");




%>
<br>
<a href="ex3.jsp" target=_blank>ex3</a><br>
<!-- test -->
<%
/*
*/
//
out.print("hello jsp");
%>

<br>
======================================
<form action="ex3.jsp" method="post">
name:<input type="text" name="name"><br>
password:<input type="password" name="password"><br>
<input type="submit" value="ok">
</form>
========================================
<hr>
<form action="ex4.jsp" method="post">
請輸入<input type="text" name="test"><br>
<input type="submit" value="ok">
</form>
</body>
</html>