<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"
    import="Model.Porder"
     import="Dao.porderDao"%>
<!DOCTYPE html>
<html>
<head>
<%
	
Porder p=(Porder)session.getAttribute("P");
new porderDao().add(p);
%>
<meta charset="BIG5">

<title>Insert title here</title>
</head>
<body>
<table width=750 align=center border=1>
	<tr height=100>
			<td align=center><jsp:include page="title.jsp"></jsp:include>
		<tr height=500>
			<td>
			<table width=500 align=center>
				<tr>
					<td colspan=2 align=center>
					<h3>帳單細目</h3>
				
				<tr>
					<td colspan=2>
					桌號:<%=p.getDesk() %>
				<tr>
					<td colspan=2>
					<hr>
				
				<tr>
					<td width=200 align=center>A套餐(120):
					<td width=300 align=center><%=p.getA() %>
				<tr>
					<td width=200 align=center>B套餐(加蛋135):
					<td width=300 align=center><%=p.getB() %>
				<tr>
					<td width=200 align=center>C套餐(加大150):
					<td width=300 align=center><%=p.getC() %>
				<tr>
					<td colspan=2>
					<hr>
				<tr>
					<td colspan=2 align=center>
					共<%=p.getSum() %>元
				
				<tr>
					<td colspan=2 align=center>
					<a href="index.jsp"> 回首頁</a>列印
					
				
			</table>
		<tr height=50>
			<td align=center><jsp:include page="end.jsp"></jsp:include>
	</table>
</body>
</html>