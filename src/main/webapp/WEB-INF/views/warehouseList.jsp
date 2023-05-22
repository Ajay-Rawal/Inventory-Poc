	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
         <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@page isELIgnored="false"%>
    
    <!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Warehouse List</title>
	<style>
		body {
			margin: 0;
			padding: 0;
			font-family: Arial, sans-serif;
			background-color: #f7f7f7;
		}

		h1 {
			margin-top: 50px;
			margin-bottom: 30px;
			font-size: 36px;
			text-align: center;
			color: #444;
		}

		form {
			margin-bottom: 30px;
			text-align: center;
		}

		label {
			font-size: 18px;
			font-weight: bold;
			color: #444;
			margin-right: 10px;
		}

		input[type=text] {
			padding: 5px;
			border: 1px solid #ccc;
			border-radius: 5px;
			font-size: 16px;
			width: 200px;
			margin-right: 10px;
		}

		button[type=submit] {
			background-color: #4CAF50;
			color: white;
			border: none;
			border-radius: 5px;
			padding: 8px 16px;
			font-size: 16px;
			cursor: pointer;
			transition: background-color 0.3s;
		}

		button[type=submit]:hover {
			background-color: #3e8e41;
		}

		table {
			margin: 0 auto;
			border-collapse: collapse;
			background-color: white;
			box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
			font-size: 16px;
		}

		table th,
		table td {
			border: 1px solid #ddd;
			padding: 10px;
			text-align: center;
		}

		table th {
			background-color: #f2f2f2;
			color: #444;
			font-weight: bold;
			font-size: 18px;
		}

		table td a {
			display: block;
			color: #4CAF50;
			font-weight: bold;
			text-decoration: none;
			transition: color 0.3s;
		}

		table td a:hover {
			color: #3e8e41;
		}
	</style>
</head>
<body>
	<h1>Warehouse List</h1>

	

	<table>
		<thead>
			<tr> 	
				<th>Warehouse ID</th>
				<th>Warehouse name</th>
				<th>Warehouse address</th>
				<th>Manager Id </th>
				<!--   <th>Phone inventory</th>
				<th>Laptop inventory</th>  -->
				<th>Inventory</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="war" items="${list}">
				<tr>
					<td>${war.wid}</td>
					<td>${war.wname}</td>
					<td>${war.waddress}</td>
					<td>${war.userId}</td>
			
					<td><a href="inventory/${war.userId}">View Inventory</a></td>
				</tr>
			</c:forEach>
		
			
	</tbody>
	</table>
		
			<br>
				
			<br>
			
			<!-- <div class="container"> -->
  
	<form action="/Inventory/searchManager" method="GET">
		<label for="user_Id">Manager ID:</label>
		<input type="text" id="userId" name="userId">
		<button type="submit">Search</button>		
		<br>			
	</form>
	
	
<!-- </div> -->
	</body>
	</html>

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
<%-- <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Warehouse List</h1>
<body>

 <form action="/Inventory/searchManager" method="GET">
  <label for="user_Id">Manager ID:</label>
  <input type="text" id="userId" name="userId">
  <button type="submit">Search</button>
</form>

<table border="2" width="70%" cellpadding="2">

    <tr> 	
      <th>Warehouse ID</th>
      <th>Warehouse name</th>
      <th>Warehouse address</th>
    <!--   <th>Product Id</th>
      <th>Inventory Id</th> -->
      <th>Phone inventory</th>
      <th>Laptop inventory</th>
    </tr>


    <c:forEach var="war" items="${list}">
      <tr>
        <td>${war.wid}</td>
        <td>${war.wname}</td>
        <td>${war.waddress}</td>
        <td>${war.inventory_id}</td>
 	 <td><a href="phoneList/${war.userId}">Phone</a></td>
					<td><a href="laptopList/${war.userId}">Laptop</a></td>
					<td><a href="inventory/${war.userId}">View Inventory</a></td>
      </tr>
    </c:forEach>     

</table>

<br>
<br>

  
</body>
</html> --%>

<!--   <h1>Search Manager or Product</h1>

    <form action="/Inventory/search" method="GET">
        <label>
            <input type="radio" name="userId" value="managerId" > Search by Manager ID
        </label>
        <label>
            <input type="radio" name="product_id" value="productId"> Search by Product ID
        </label>
        <br>
        <br>
        <input type="text" name="searchValue" placeholder="">
        <button type="submit">Search</button>
    </form> -->