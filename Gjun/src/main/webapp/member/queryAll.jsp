<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"
    import="Dao.memberDao"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
<table width=600 align=center border=1>
		<tr>
			<td height=100 align=center>
			<jsp:include page="../title.jsp"></jsp:include>
		<tr>
			<td height=400 align=center>
			<table width=500 align=center>
			<tr>
			<td>ID<td>�b��<td>�K�X<td>�m�W<td>�a�}<td>�q��<td>���
			<%=new memberDao().queryAll() %>			
			</table>
		<tr>
			<td height=50 align=center>
			<jsp:include page="../end.jsp"></jsp:include>
	
	</table>

</body>
</html>