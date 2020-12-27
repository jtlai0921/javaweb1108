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
	Cookie[] cookie=request.getCookies();

	for(Cookie c:cookie)
	{
		if(c.getName().equals("UserName"))
		{
			out.println(c.getValue());
		}
	}


%>

</body>
</html>