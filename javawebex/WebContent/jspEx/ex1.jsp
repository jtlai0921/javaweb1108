<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
<%!
int x;
int cal(int x,int y)
{
	return x+y;
}
%>
</head>
<body>
<%
int y;
System.out.println("hello jsp");
System.out.println("20+20="+cal(20,20));

%>
20+50=<%=cal(20,50) %>
</body>
</html>