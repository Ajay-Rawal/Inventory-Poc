<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  





<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Add New Product</title>
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/8.0.1/normalize.min.css">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
	<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700&display=swap">
	<style>
		body {
			background-color: #f8f8f8;
			font-family: 'Open Sans', sans-serif;
		}
		
		.container {
			max-width: 600px;
			margin: 0 auto;
			padding: 20px;
			background-color: #fff;
			box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
			border-radius: 5px;
			text-align: center;
		}
		
		h1 {
			font-size: 36px;
			margin-bottom: 20px;
		}
		
		form {
			display: inline-block;
			text-align: left;
		}
		
		label {
			display: block;
			font-size: 16px;
			margin-bottom: 5px;
		}
		
		input[type="text"],
		input[type="number"] {
			padding: 10px;
			font-size: 16px;
			border-radius: 5px;
			border: 1px solid #ccc;
			width: 100%;
			margin-bottom: 15px;
		}
		
		input[type="submit"] {
			padding: 10px 20px;
			font-size: 18px;
			background-color: #007bff;
			color: #fff;
			border-radius: 5px;
			border: none;
			cursor: pointer;
		}
		
		input[type="submit"]:hover {
			background-color: #0069d9;
		}
	</style>
</head>
<body>
	<div class="container">
		<h1>Add New Product</h1>
		<form:form method="post" action="/Inventory/saveproduct">  
			<label for="product_id">Product ID:</label>
			<form:input path="product_id" id="product_id" />
			<label for="product_name">Product Name:</label>
			<form:input path="Product_name" id="product_name" />
			<label for="description">Description:</label>
			<form:input path="description" id="description" />
			<label for="price">Price:</label>
			<form:input path="price" id="price" />
			<label for="pquantity">Quantity:</label>
			<form:input path="Pquantity" id="pquantity" />
			<label for="cid">Category ID:</label>
			<form:input path="Cid" id="cid" />
			<label for="userId">Manager ID:</label>
			<form:input path="userId" id="userId" />
			<input type="submit" value="Save" />
		</form:form>
	</div>
</body>
</html>


	<%-- 	<h1>Add New Product</h1>
       <form:form method="post" action="/Inventory/saveproduct">  
      	<table >  
      	<tr>  
          <td>Product Id : </td> 
          <td><form:input path="product_id"  /></td>
         </tr>
         <tr>  
          <td>Product Name : </td> 
          <td><form:input path="Product_name"  /></td>
         </tr>  
         <tr>  
          <td>Description :</td>  
          <td><form:input path="description" /></td>
         </tr> 
         <tr>  
          <td>Price :</td>  
          <td><form:input path="price" /></td>
         </tr> 
          <tr>  
          <td>Quantity :</td>  
          <td><form:input path="Pquantity" /></td>
         </tr> 
         <tr>  
          <td>Category Id :</td>  
          <td><form:input path="Cid" /></td>
         </tr> 
         
         <tr>  
          <td> </td>  
          <td><input type="submit" value="Save" /></td>  
         </tr>  
        </table>  
       </form:form>   --%>
