<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"
    import="Dao.porderDao"%>
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
		<tr >
			<td  align=center>
				<table width=600 align=center >
					<tr>
						<td align=center>
						<form action="delete.jsp" method="post">
							
							id<input type="number" name="id" size=4>
							
							<input type="submit" value="�d��">							
						</form>
					<tr>
						<td>
						<hr>
					<tr>
						<td align=center>
						<table width=500 align=cenetr>
						<tr>
						<td>ID<td>�ู<td>A�\<td>B�\<td>C�\<td>���B
						<%
						
							
						String ID=request.getParameter("id");
						if(ID!=null && ID!="")
						{
							int id=Integer.parseInt(ID);
							new porderDao().delete(id);
						}
						out.println(new porderDao().queryAll());
						
						
						
						
						
						%>
						<tr>
							<td colspan=6 align=center>
							<a href="index.jsp">Home</a>
						</table>
					<tr>
						<td>
				</table>
				
			
		<tr height=50>
			<td align=center><jsp:include page="end.jsp"></jsp:include>
	</table>

</body>
</html>