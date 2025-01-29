<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>All Employee Details</h2>
<table border="1">
<tr>
	<th>Id</th>
	<th>Name</th>
	<th>Salary</th>
	<th>DOJ</th>
</tr>
<%
Object data = request.getAttribute("obj");
ResultSet rs = (ResultSet)data;					//type casting 
while(rs.next()){
	%>
	<tr>
		<td><%=rs.getInt(1) %></td>
		<td><%=rs.getString(2) %></td>
		<td><%=rs.getFloat(3) %></td>
		<td><%=rs.getDate(4) %></td>
	</tr>
	<%
}
rs.close();
%>
</table>
<br/>
<a href="index.html">Back</a>
</body>
</html>