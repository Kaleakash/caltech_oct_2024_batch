<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Add Batch Details</h2>
<form action="" method="post">
	<label>BatchId</label>
	<input type="number" name="bid"/><br/>
	<label>TypeOfBatch</label>
	<input type="radio" name="typeofbatch" value="Morning"/>Morning Batch
	<input type="radio" name="typeofbatch" value="Evening"/>Evening Batch<br/>
	<label>Time</label>
	<select name="time">
	<option value="7am-8am">7am-8am</option>
	<option value="8am-9am">8am-9am</option>
	<option value="7pm-8pm">7pm-8pm</option>
	<option value="8am-9am">8pm-9pm</option>
	</select><br/>
	<input type="submit" value="Add Batch"/>
</form>
<a href="index.html">Back</a>
</body>
</html>