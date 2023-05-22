<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
     
     
     <!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Phone List</title>
	<style>
		body {
			font-family: Arial, sans-serif;
			background-color: #f2f2f2;
			margin: 0;
			padding: 0;
		}
		h1 {
			background-color: #007bff;
			color: #fff;
			padding: 10px;
			margin: 0;
			text-align: center;
		}
		table {
			margin: 20px auto;
			border-collapse: collapse;
			background-color: #fff;
			box-shadow: 0px 0px 10px rgba(0,0,0,0.2);
			width: 80%;
			max-width: 800px;
		}
		th, td {
			padding: 10px;
			text-align: center;
			border-bottom: 1px solid #ddd;
		}
		tr:hover {
			background-color: #f5f5f5;
		}
		a {
			display: inline-block;
			background-color: #007bff;
			color: #fff;
			padding: 10px 20px;
			margin: 10px;
			text-decoration: none;
			border-radius: 5px;
		}
		a:hover {
			background-color: #0062cc;
		}
	</style>
</head>
<body>
	<h1>Phone List</h1>

	<table>
		<tr>
			<th>Product Id</th>
			<th>Product Name</th>
			<th>Description</th>
			<th>Price</th>
			<th>Quantity</th>
			<th>Category Id</th>
			<!-- <th>Edit</th>
			<th>Delete</th> -->
		</tr>

		<c:forEach var="product" items="${list}">
			<tr>
				<td>${product.product_id}</td>
				<td>${product.product_name}</td>
				<td>${product.description}</td>
				<td>${product.price}</td>
				<td>${product.pquantity}</td>
				<td>${product.cid}</td>
			<%-- 	<td><a href="editProduct/${product.product_id}">Edit</a></td>
				<td><a href="deleteproduct/${product.product_id}">Delete</a></td> --%>
			</tr>
		</c:forEach>
	</table>

	
</body>
</html>