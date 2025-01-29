<%@page import="java.util.Iterator"%>
<%@page import="com.bean.Employee"%>
<%@page import="java.util.List"%>
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
List<Employee> listOfEmp = (List<Employee>)data;					//type casting 
Iterator<Employee> li = listOfEmp.iterator();
while(li.hasNext()){
	Employee emp = li.next();
	%>
	<tr>
		<td><%= emp.getId()%></td>
		<td><%=emp.getName() %></td>
		<td><%=emp.getSalary() %></td>
		<td><%=emp.getDoj() %></td>
	</tr>
	<%
}

%>
</table>
<br/>
<a href="index.html">Back</a>
</body>
</html>