<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
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
			<td height=400>
			<form action="" method="">
			<table width=400 align=center>
					<tr>
						<td colspan=2 align=center>
						<h3>�|�����U</h3>
					<tr>
						<td align=center>�b��
						<td align=center><input type="text" name="username">
					<tr>
						<td align=center>�K�X
						<td align=center><input type="password" name="password">
					<tr>
						<td align=center>�m�W
						<td align=center><input type="text" name="name">
					
					<tr>
						<td align=center>�a�}
						<td align=center><input type="text" name="address">
					<tr>
						<td align=center>�q��
						<td align=center><input type="text" name="phone">
					
					<tr>
						<td align=center>���
						<td align=center><input type="text" name="mobile">
					
					<tr>
						<td colspan=2 align=center>
						<input type="submit" value="ok">				
				</table>
				</form>
		<tr>
			<td height=50 align=center>
			<jsp:include page="../end.jsp"></jsp:include>
	
	</table>

</body>
</html>