<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
     
     
     <!DOCTYPE html>
<html>
<head>
	<title>Product List</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	<style>
		.container {
			margin-top: 50px;
		}
		.table {
			margin-top: 20px;
		}
	</style>
</head>
<body>

	<div class="container">
		<h1 class="text-center mb-5">Product List</h1>
	
		<table class="table table-bordered table-striped">
			<thead class="thead-dark">
				<tr>
					<th>Product Id</th>
					<th>Product Name</th>
					<th>Description</th>
					<th>Price</th>
					<th>Category Id</th>			
					<th>User Id</th>
				
					<th>Quantity</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="product" items="${product}">
					<tr>
						<td>${product.product_id}</td>
						<td>${product.product_name}</td>
						<td>${product.description}</td>
						<td>${product.price}</td>
						<td>${product.pquantity}</td>
						<td>${product.cid}</td>
						<td>${product.userId}</td> 
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>

	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>
     
     
     
     
     
     
     
     
     
     
     
     
     
     
    <%--  <!DOCTYPE html>
<html>
<head>
	<title>Product List</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>

	<div class="container mt-5">
		<h1 class="text-center mb-5">Product List</h1>
	
	
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>Product Id</th>
					<th>Product Name</th>
					<th>Description</th>
					<th>Price</th>
					<th>Quantity</th>
					<th>Category Id</th>
					<th>User Id</th>
				
				</tr>
			</thead>
			<tbody>
				<c:forEach var="product" items="${product}">
					<tr>
						<td>${product.product_id}</td>
						<td>${product.product_name}</td>
						<td>${product.description}</td>
						<td>${product.price}</td>
						<td>${product.pquantity}</td>
						<td>${product.cid}</td>
						<td>${product.userId}</td> 
					
					</tr>
				</c:forEach>
			</tbody>
		</table>

		
	</div>

	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html> --%>