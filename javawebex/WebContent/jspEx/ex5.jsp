<%@ page 
language="java" 
contentType="text/html; charset=BIG5"
pageEncoding="BIG5"
import="java.util.Date"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<%
Date d=new Date();
%>
<body>
�{�b���:<%=d %><br>
��:<%=d.getDate() %><br>
�P:<%=d.getDay()%><br>
��:<%=d.getMonth()+1 %><br>
��:<%=d.getHours() %><br>
��:<%=d.getMinutes() %><br>
S:<%=d.getSeconds() %><br>
S:<%=d.getTimezoneOffset() %><br>

</body>
</html>