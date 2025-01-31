<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Using JSP to get information</h2>
<%!
String msg;
String tech[];
%>
<%
msg = (String)session.getAttribute("msg");
out.println(msg);
out.println("<br/>");
tech = (String[])session.getAttribute("tech");
for(String t:tech){
	out.println(t+"<br/>");
}
%>
<h2>Using JSTL to get information</h2>
<core:out value="${sessionScope.msg}"></core:out>
<h2>All technologies</h2>
<ul>
<core:forEach items="${sessionScope.tech}" var="t">
	<li><core:out value="${t}"></core:out></li>
</core:forEach>
</ul>
</body>
</html>

