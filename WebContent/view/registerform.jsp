<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>register</title>
</head>

<style>
	div.ex{
		text-align:center;
		width:35%;
		padding:10px;
		border:5px solid grey;
		margin:20px;
	}
</style>

<body>
<h1>Registration Form</h1>
	<div class="ex">
		<form action="/helloMVC/doRegister" method="post">
		<p>Enter Information Here</p>
			<table cellpadding="5">
				<tr>
					<td>ID</td>
					<td><input type="text" name="id"/></td>
				</tr>
				<tr>
					<td>PW</td>
					<td><input type="password" name="password"/></td>
				</tr>
				<tr>
					<td>NAME</td>
					<td><input type="text" name="name"/></td>
				</tr>
				<tr>
					<td>GENDER</td>
					<td>
						<input type="radio" name="gender" value="male">남자
						<input type="radio" name="gender" value="female">여자
					</td>
				</tr>
				<tr>
					<td>EMAIL</td>
					<td><input type="text" name="email"/></td>
				</tr>
				<tr>
					<td></td>
					<td><input type = "submit" value="register"/></td>
				</tr>
			</table>	
		</form>
	</div>
</body>
</html>