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
								���B: �q<input type="text" name="start"> ��<input
									type="text" name="end"> <input type="submit" value="�d��">
							</form>
					<tr>
						<td>
							<hr>
					<tr>
						<td align=center>
							<table width=500 align=cenetr>
								<tr>
									<td>ID
									<td>�ู
									<td>A�\
									<td>B�\
									<td>C�\
									<td>���B 
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