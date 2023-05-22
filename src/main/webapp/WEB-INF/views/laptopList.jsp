<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
     
     
     
     <!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Laptop List</title>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
  <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
</head>
<body>
  <nav>
    <div class="nav-wrapper">
      <a href="#" class="brand-logo center">Laptop List</a>
    </div>
  </nav>
  <br>
  <div class="container">
    <table class="highlight">
      <thead>
        <tr>
          <th>Product Id</th>
          <th>Product Name</th>
          <th>Description</th>
          <th>Price</th>
          <th>Quantity</th>
          <th>Category Id</th>
         <!--  <th>Edit</th>
          <th>Delete</th> -->
        </tr>
      </thead>
      <tbody>
        <c:forEach var="product" items="${list}">
          <tr>
            <td>${product.product_id}</td>
            <td>${product.product_name}</td>
            <td>${product.description}</td>
            <td>${product.price}</td>
            <td>${product.pquantity}</td>
            <td>${product.cid}</td>
            <%-- <td><a class="waves-effect waves-light btn" href="editProduct/${product.product_id}">Edit</a></td>
            <td><a class="waves-effect waves-light btn red" href="deleteproduct/${product.product_id}">Delete</a></td> --%>
          </tr>
        </c:forEach>
      </tbody>
    </table>
    <br>
    
  </div>
</body>
</html>
     
     
     
     
     
     
     
     
     
<%-- <!DOCTYPE html>
<html>
</head>
<body>
<h1>Laptop List</h1>

<table border="2" width="70%" cellpadding="2">

<tr><th>Product Id</th><th>Product Name</th><th>Description</th><th>Price</th><th>Quantity</th><th>Category Id</th><th>Edit</th><th>Delete</th></tr>

<c:forEach var="product" items="${list}">

<tr>
<td>${product.product_id}</td>
<td>${product.product_name}</td>
<td>${product.description}</td>
<td>${product.price}</td>
<td>${product.pquantity}</td>
<td>${product.cid}</td>
<td><a href="editProduct/${product.product_id}">Edit</a></td>
<td><a href="deleteproduct/${product.product_id}">Delete</a></td>
</tr>
</c:forEach>
</table>
<br/>
<a href="addProduct">Add New item</a>
</body>
</html> --%>