<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    
     <%@page isELIgnored="false"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
     
     
     
     <!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Product Details</title>
	<style>
		table {
			font-family: Arial, sans-serif;
			border-collapse: collapse;
			width: 100%;
			margin-top: 50px;
		}

		td, th {
			border: 1px solid #ddd;
			padding: 8px;
		}

		th {
			background-color: #f2f2f2;
			color: #333;
			font-weight: bold;
			text-align: left;
			padding-top: 12px;
			padding-bottom: 12px;
		}

		td {
			color: #555;
			font-size: 16px;
			font-weight: bold;
			text-align: left;
			padding-top: 8px;
			padding-bottom: 8px;
		}

		.btn {
			background-color: #4CAF50;
			color: white;
			padding: 10px 20px;
			border: none;
			border-radius: 4px;
			cursor: pointer;
			font-size: 16px;
			margin-top: 20px;
		}

		.btn:hover {
			background-color: #3e8e41;
		}

		h1 {
			font-family: Arial, sans-serif;
			font-size: 36px;
			font-weight: bold;
			text-align: center;
			margin-top: 50px;
			margin-bottom: 50px;
		}

	</style>
</head>
<body>
	<div class="container">
		<h1>Product Details</h1>
		<table>
			<thead>
				<tr>
					<th>Product ID</th>
					<th>Product Name</th>
					<th>Description</th>
					<th>Price</th>
					<th>Quantity</th>
					<th>Category ID</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>${product.product_id}</td>
					<td>${product.product_name}</td>
					<td>${product.description}</td>
					<td>${product.price}</td>
					<td>${product.pquantity}</td>
					<td>${product.cid}</td>
				</tr>
			</tbody>
		</table>
		<br>
		<a href="managerList" class="btn">Back to ManagerList</a>
	</div>
</body>
</html>
     
     
     
     
     
<%-- <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
			<thead>
				<tr>
					<th>Product Id</th>
					<th>Product Name</th>
					<th>Description</th>
					<th>Price</th>
					<th>Quantity</th>
					<th>Category Id</th>
				
				</tr>
			</thead>
			<tbody>
		
					<tr>
						<td>${product.product_id}</td>
						<td>${product.product_name}</td>
						<td>${product.description}</td>
						<td>${product.price}</td>
						<td>${product.pquantity}</td>
						<td>${product.cid}</td>
				
					</tr>
				
			</tbody>
		</table>
</body>
</html>
 --%>
