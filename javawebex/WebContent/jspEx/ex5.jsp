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
現在日期:<%=d %><br>
日:<%=d.getDate() %><br>
周:<%=d.getDay()%><br>
月:<%=d.getMonth()+1 %><br>
時:<%=d.getHours() %><br>
分:<%=d.getMinutes() %><br>
S:<%=d.getSeconds() %><br>
S:<%=d.getTimezoneOffset() %><br>

</body>
</html>