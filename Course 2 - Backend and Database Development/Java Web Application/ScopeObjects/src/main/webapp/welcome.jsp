<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
//Object id = request.getAttribute("eid");
//Object name = request.getAttribute("ename");
//Object salary = request.getAttribute("esalary");
//int id = (int)request.getAttribute("eid");
//String name = (String)request.getAttribute("ename");
//float salary = (float)request.getAttribute("esalary");
out.println("<br/> In JSP page");
//out.println("<br/> id is "+id);
//out.println("<br/> name is "+name);
//out.println("<br/> salary is "+salary);

// getting the value from session scope 
int id = (int)session.getAttribute("eid");
String name = (String)session.getAttribute("ename");
float salary = (float)session.getAttribute("esalary");
out.println("<br/> Id is "+id);
out.println("<br/> Name is "+name);
out.println("<br/> Salary is "+salary);
%>
</body>
</html>