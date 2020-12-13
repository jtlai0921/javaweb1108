<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"
    import="Model.Porder"
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
						<form action="update.jsp" method="post">
							
							ID:<input type="number" name="id" size=2>
							桌號
							<select name="desk" >
								<option value="">
								<option value="甲">甲
								<option value="乙">乙
								<option value="丙">丙
								<option value="丁">丁
							</select>
							A:<input type="number" name="A" size=2>
							B:<input type="number" name="B" size=2>
							C:<input type="number" name="C" size=2>
							</select>
							<input type="submit" value="修改">							
						</form>
					<tr>
						<td>
						<hr>
					<tr>
						<td align=center>
						<table width=500 align=cenetr>
						<tr>
						<td>ID<td>桌號<td>A餐<td>B餐<td>C餐<td>金額
						<%
						
							request.setCharacterEncoding("big5");
							String ID=request.getParameter("id");
							String DESK=request.getParameter("desk");
							String A=request.getParameter("A");
							String B=request.getParameter("B");
							String C=request.getParameter("C");
							
							Porder p=new Porder();
							if(ID!=null && ID!="" && DESK!=null && A!=null && B!=null && C!=null)
							{
								int id=Integer.parseInt(ID);
								if(DESK!="") p.setDesk(DESK);
								if(A!="") p.setA(Integer.parseInt(A));
								if(B!="") p.setB(Integer.parseInt(B));
								if(C!="") p.setC(Integer.parseInt(C));
								
								new porderDao().update(id, p);
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