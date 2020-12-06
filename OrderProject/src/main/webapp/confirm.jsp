<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"
    import="Model.Porder"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<%
	request.setCharacterEncoding("big5");
	
	String Desk=request.getParameter("desk");
	int A=Integer.parseInt(request.getParameter("A"));
	int B=Integer.parseInt(request.getParameter("B"));
	int C=Integer.parseInt(request.getParameter("C"));

	Porder p=new Porder(Desk,A,B,C);
	session.setAttribute("P", p);


%>

<body>
<table width=750 align=center border=1>
		<tr height=100>
			<td align=center><jsp:include page="title.jsp"></jsp:include>
		<tr height=500>
			<td>
			<table width=400 align=center>
				<tr>
					<td colspan=2 align=center>
					<h3>這是你的點餐細目</h3>
				
				<tr>
					<td colspan=2>
					桌號:<%=p.getDesk() %>
				<tr>
					<td colspan=2>
					<hr>
				
				<tr>
					<td width=100 align=center>A套餐(120):
					<td width=300 align=center><%=p.getA() %>
				<tr>
					<td width=100 align=center>B套餐(加蛋135):
					<td width=300 align=center><%=p.getB() %>
				<tr>
					<td width=100 align=center>CB套餐(加大150):
					<td width=300 align=center><%=p.getC() %>
				<tr>
					<td colspan=2>
					<hr>
				<tr>
					<td colspan=2 align=center>
					共<%=p.getSum() %>元
				
				<tr>
					<td colspan=2 align=center>
					<a href="addOrderController">確定</a>
					<a href="addOrder.jsp">重新點餐</a>
				
			</table>
			
		<tr height=50>
			<td align=center><jsp:include page="end.jsp"></jsp:include>
	</table>
</body>
</html>