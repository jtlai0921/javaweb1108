<%@ page language="java" contentType="text/html; charset=BIG5"
	pageEncoding="BIG5" import="Dao.porderDao"%>
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
		<tr>
			<td align=center>
				<table width=600 align=center>
					<tr>
						<td align=center>
							<form action="query.jsp" method="post">
								金額: 從<input type="text" name="start"> 到<input
									type="text" name="end"> <input type="submit" value="查詢">
							</form>
					<tr>
						<td>
							<hr>
					<tr>
						<td align=center>
							<table width=500 align=cenetr>
								<tr>
									<td>ID
									<td>桌號
									<td>A餐
									<td>B餐
									<td>C餐
									<td>金額 
									<%
										String Start = request.getParameter("start");
									String End = request.getParameter("end");
								
									if (Start != null && End != null && Start !="" && End !="") {
										int S = Integer.parseInt(Start);
										int E = Integer.parseInt(End);

										out.println(new porderDao().querySum(S, E));
									} else {
										out.println(new porderDao().queryAll());
									}
									%>
							</table>
					<tr>
						<td>
				</table>
		<tr height=50>
			<td align=center><jsp:include page="end.jsp"></jsp:include>
	</table>

</body>
</html>