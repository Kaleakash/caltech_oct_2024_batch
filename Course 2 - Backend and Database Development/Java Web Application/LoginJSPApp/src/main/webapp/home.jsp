<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!String user; %>
<%
user = request.getParameter("emailid");
%>
<font color="red" size=6> Welcome user <%=user %></font>
<br/>
<a href="login.jsp">Logout</a>
</body>
</html>