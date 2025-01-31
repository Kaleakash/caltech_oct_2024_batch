<%@page import="java.util.Iterator"%>
<%@page import="com.bean.Product"%>
<%@page import="java.util.List"%>
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
<h2>List Of Product in table format using JSP</h2>
<table border="1">
	<tr>
		<th>PId</th>
		<th>PName</th>
		<th>Price</th>
		<th>Qty</th>
		<th>URL</th>
	</tr>
<%!List<Product> listOfProduts; %>
<%
listOfProduts = (List<Product>)session.getAttribute("products");
Iterator<Product> li = listOfProduts.iterator();
while(li.hasNext()){
	Product p = li.next();
	%>
	<tr>
		<td><%=p.getPid() %></td>
		<td><%=p.getPname() %></td>
		<td><%=p.getPrice() %></td>
		<td><%=p.getQty() %></td>
		<td><img src="<%=p.getUrl()%>" width="100px" height="100px"/></td>
	</tr>
	<%
}
%>
</table>

<hr/>

<h2>List Of Product in table format using JSP</h2>
<table border="1">
	<tr>
		<th>PId</th>
		<th>PName</th>
		<th>Price</th>
		<th>Qty</th>
		<th>URL</th>
	</tr>
	<core:forEach items="${sessionScope.products}" var="product">
		<tr>
		<core:if test="${product.getPrice() > 50000}">
			<td><core:out value="${product.getPid()}"></core:out> </td>
			<td><core:out value="${product.getPname()}"></core:out> </td>
			<td><core:out value="${product.getPrice()}"></core:out> </td>
			<td><core:out value="${product.getQty()}"></core:out> </td>
			<td><img src="<core:out value="${product.getUrl()}"> </core:out>" width="100px" height="100px"/></td>
		</core:if>
		</tr>
	</core:forEach>	
	
</table>	

</body>
</html>