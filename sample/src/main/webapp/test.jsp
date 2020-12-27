<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
 <head>
<meta charset="BIG5">
<title>Insert title here</title>
	<script type="text/javascript">
		function check()
		{
			
			if(loginForm.name.value=="")
				{
					alert("姓名不可空白");
					return ;
				}
			if(loginForm.user.value=="")
				{
				alert("帳號不可為空");
				return;
				}
			loginForm.submit();
		}
	
	
	</script>
	<link rel="stylesheet" href="css/st.css"></link>
</head>
<body>
<div class="header">
	</div>


	<div class="sideBar">
		
	
	
	</div>
	
	
	<div class="main">
		<form name="loginForm" action="login.html" mehod="post">
			<table width=70% align=center border=1>
				<tr>
					<td colspan=2 height=100px>
				<tr>
					<td>name
					<td><input type="text" name="name">
				<tr>
					<td>user
					<td><input type="text" name="user">
				<tr>
					<td colspan=2 align=center>
					<input type="button" value="ok" onClick="check()">
			
			</table>	
		</form>
	
	
	
	</div>
	
	
	<div class="footer">
	</div>
	
	

</body>
</html>