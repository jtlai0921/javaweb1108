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
			<td>
				<form action="confirm.jsp" method="post">
					<table width=600 align=center border=0>
						<tr>
							<td colspan=3>						
							�ู:
							<select name="desk">
								<option value="��">��
								<option value="VIP2">VIP2
								<option value="VIP3">VIP3
								<option value="VIP4">VIP4
							</select>
						<tr>
							<td colspan=3>	
						<hr>
						
						<tr>
							<td width=200>
							A�M�\(���q120��)<br>
							<img alt="A�\" src="pic/1.jpg"><br>
							<select name="A">
								<option value="0">0
								<option value="1">1
								<option value="2">2
								<option value="3">3
								<option value="4">4
								<option value="5">5
								<option value="6">6
								<option value="7">7
								<option value="8">8
								<option value="9">9				
							
							</select>
							
							<td width=200>
							B�M�\(�[�J135��)<br>
							<img alt="B�\" src="pic/2.jpg">
							<select name="B">
								<option value="0">0
								<option value="1">1
								<option value="2">2
								<option value="3">3
								<option value="4">4
								<option value="5">5
								<option value="6">6
								<option value="7">7
								<option value="8">8
								<option value="9">9	
							
							</select>
							
							<td width=200>
							C�M�\(�����q150��)<br>
							<img alt="C�\" src="pic/3.jpg">
							<select name="C">
								<option value="0">0
								<option value="1">1
								<option value="2">2
								<option value="3">3
								<option value="4">4
								<option value="5">5
								<option value="6">6
								<option value="7">7
								<option value="8">8
								<option value="9">9	
							</select>
						<tr>
							<td colspan=3>	
						<hr>
						<tr>
							<td colspan=3 align=center>
							<input type="submit" value="�U��">
							
							<a href="index.jsp">�^����</a>
							
					</table>
				</form>
			
		<tr height=50>
			<td align=center><jsp:include page="end.jsp"></jsp:include>
	</table>
</body>
</html>