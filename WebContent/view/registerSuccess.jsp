<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
		you registered successfully!
		
		
	<ul>
		<li> Id : ${customer.id }</li>
		<li> Password : ${customer.password }</li>
		<li> Gender : ${customer.gender }</li>
		<li> Name : ${customer.name }</li>
		<li> Email : ${customer.email }</li>
		
	</ul>
	<p> <a href="/helloMVC/view/loginform.jsp"> go to login form</a>
	<p> <a href="/helloMVC/index.jsp"> main page</a>
</body>
</html>