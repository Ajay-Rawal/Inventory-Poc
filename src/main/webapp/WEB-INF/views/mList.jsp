<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
         <%@page isELIgnored="false"%>
              <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
              
              
              <!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>User Details</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
	<div class="container mt-5">
		<div class="card mx-auto" style="max-width: 500px;">
			<div class="card-header">
				<h4 class="text-center">User Details</h4>
			</div>
			<div class="card-body">
				<table class="table table-bordered">
					<tr>
						<th>User ID</th>
						<td>${user.userId}</td>
					</tr>
					<tr>
						<th>User Name</th>
						<td>${user.username}</td>
					</tr>
					<tr>
						<th>Password</th>
						<td>${user.password}</td>
					</tr>
					<tr>
						<th>Email</th>
						<td>${user.email}</td>
					</tr>
					<tr>
						<th>Role</th>
						<td>${user.role}</td>
					</tr>
				</table>
			</div>
		</div>
	</div>
</body>
</html>
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
<%--          
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
			<thead>
				<tr>
					<th>User Id</th>
					<th>User Name</th>
					<th>Password</th>
					<th>Email</th>
					<th>Role</th>
				
				</tr>
			</thead>
			<tbody>
		
					<tr>
						<td>${user.userId}</td>
						<td>${user.username}</td>
						<td>${user.password}</td>
						<td>${user.email}</td>
						<td>${user.role}</td>
						
				
					</tr>
				
			</tbody>
		</table>
</body>
</html> --%>