<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"
    import="Model.porder"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<%
porder p=(porder)session.getAttribute("P");
%>
<body>
desk:<%=p.getDesk() %><br>
A:<%=p.getA() %><br>
B:<%=p.getB() %><br>
C:<%=p.getC() %><br>
共:<%=p.getSum() %>元<br>
<a href="addPorderController">確定</a><br>
<a href="index.jsp">重填</a>
</body>
</html>