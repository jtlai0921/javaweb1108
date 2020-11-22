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
	String Test=request.getParameter("test");
	if(Test.equals("A"))
	{
		response.sendRedirect("A.jsp");
	}
	else if(Test.equals("B"))
	{
		response.sendRedirect("B.jsp");
	}
	else
	{
		response.sendRedirect("C.jsp");
	}

%>
</body>
</html>