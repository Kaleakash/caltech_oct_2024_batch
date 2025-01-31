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
<%!int a=10,b=20,sum; %>
<%
sum = a+b;
%>
<p>Sum of two number is <%=sum %></p>
<br/>
<p>Sum of two number is <%=100+200 %></p>
<br/>
<h2>Basic Operation using EL</h2>
<p>Sum of two number is ${100+200}</p>
<p>Sub of two number is ${100-200}</p>
<p>Mul of two number is ${100*200}</p>
<p>Div of two number is ${100/200}</p>
<p>Div of two number is ${100 div 200}</p>
<p>Gt of two number is ${100 > 200}</p>
<p>GT of two number is ${100 gt 200}</p>
<p>Lt of two number is ${100 < 200}</p>
<p>Lt of two number is ${100 lt 200}</p>
<br/>
<core:set var="name" value="Akash Kale!"></core:set>
<br/>
Msg : <core:out value="Welcome to JSTL"></core:out><br/>
Value of name is : <core:out value="name"></core:out><br/>
Value of name is : <core:out value="${name}"></core:out><br/>
</body>
</html>




