<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!String emailid,password; %>
<%
emailid = request.getParameter("emailid");
password = request.getParameter("password");
//RequestDispatcher rd1 = request.getRequestDispatcher("home.jsp");
//RequestDispatcher rd2 = request.getRequestDispatcher("login.jsp");

if(emailid.equals("akash@gmail.com") && password.equals("123")){
	out.println("successfully login");
	//rd1.forward(request, response);
	%>
	<jsp:forward page="home.jsp"></jsp:forward>
	<%
}else {
	out.println("failure try once again");
	//rd2.include(request, response);
	%>
	<jsp:include page="login.jsp"></jsp:include>
	<%
}
%>
</body>
</html>