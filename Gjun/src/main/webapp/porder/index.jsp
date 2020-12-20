<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
<table width=750 align=center border=1>
		<tr height=100>
			<td align=center><jsp:include page="title.jsp"></jsp:include>
		<tr height=500>
		<td  align=center>
				<table width=400 >
					<tr align=center>
						<td><a href="addOrder.jsp">1)點餐</a>
					<tr align=center>
						<td><a href="query.jsp">2)查詢</a>
					<tr align=center>
						<td><a href="update.jsp">3)修改</a>
					<tr align=center>
						<td><a href="delete.jsp">4)刪除</a>
			<td>
		<tr height=50>
			<td align=center><jsp:include page="end.jsp"></jsp:include>
	</table>
</body>
</html>