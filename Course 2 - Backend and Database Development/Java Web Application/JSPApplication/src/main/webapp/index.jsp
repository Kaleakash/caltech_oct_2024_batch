<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Welcome to JSP Example</h2>
<%!
int a,b,sum,x,y;
%>
<%
	System.out.println("Welcome to JSP on console");
	out.println("Welcome to JSP on browser<br/>");
	out.println("<h2>Welcome once again</h2>");
	//int a=10;
	//int b=20;
	//int sum = a+b;
	a=10;
	b=20;
	sum =a+b;
	out.println("Sum of two number is "+sum);
	out.println("<br/>");
	out.println("<font color='red'>Sum of two number is "+sum+"</font>");
	out.println("name is "+name);
%>
<br/>
<%!String name="Steven"; %>
<%
//int x=10;
//int y=50;
x=10;
y=50;
if(x>y){
	out.println("X is largest");
}else {
	out.println("Y is largest");
}
%>

<br/>
<p><font color='green'>Sum of two number is <%=100+200 %></font></p>
<p><font color="blue">Sum of <%=a %> and <%=b %> is <%=sum %></font></p>

</body>
</html>