<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Add Employee</h2>
<form action="AddEmployeeController" method="post">
<label>Employee Id</label>
<input type="number" name="id"/><br/>
<label>Employee Name</label>
<input type="text" name="name"/><br/>
<label>Employee Salary</label>
<input type="number" name="salary"/><br/>
<label>DOJ</label>
<input type="date" name="doj"/><br/>
<input type="submit" value="Add Employee"/>
<input type="reset" value="reset"/>
</form>
<br/>
<a href="index.html">Back</a>
</body>
</html>