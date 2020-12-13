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
							桌號:
							<select name="desk">
								<option value="梅">梅
								<option value="竹">竹
								<option value="菊">菊
								<option value="蘭">蘭
							</select>
						<tr>
							<td colspan=3>	
						<hr>
						
						<tr>
							<td width=200>
							A套餐(普通120元)<br>
							<img alt="A餐" src="pic/1.jpg"><br>
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
							B套餐(加蛋135元)<br>
							<img alt="B餐" src="pic/2.jpg">
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
							C套餐(雙倍量150元)<br>
							<img alt="C餐" src="pic/3.jpg">
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
							<input type="submit" value="下單">
							
							<a href="index.jsp">回首頁</a>
							
					</table>
				</form>
			
		<tr height=50>
			<td align=center><jsp:include page="end.jsp"></jsp:include>
	</table>
</body>
</html>