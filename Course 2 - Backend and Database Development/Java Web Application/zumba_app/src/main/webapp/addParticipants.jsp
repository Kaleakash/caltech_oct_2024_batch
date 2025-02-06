<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>Add Participants Details</h2>
<form>
<label>Participants Id</label>
<input type="number" name="pid"/><br/>
<label>Participants Name</label>
<input type="text" name="name"/><br/>
<label>Participants age</label>
<input type="number" name="age"/><br/>
<label>Batch</label>
<select name="bid">
	<core:forEach items="${sessionScope.batches}" var="batch">
		<option value="${batch.getBid()}"> <core:out value="${batch.getTypeofbatch()}-${batch.getTime()}"></core:out> </option>
	</core:forEach>
</select>
</form>
<a href="index.html">Back</a>
</body>
</html>