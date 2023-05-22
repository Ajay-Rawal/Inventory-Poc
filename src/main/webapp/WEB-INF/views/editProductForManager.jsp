<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 

<!DOCTYPE html>
<html>
<head>
	<title>Edit Product</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
	<div class="container mt-5">
		<div class="row">
			<div class="col-md-6 offset-md-3">
				<h1 class="text-center mb-4">Edit Product</h1>
				<form:form method="POST" action="editsaveproductForManager" class="form">
					<div class="form-group">
						<form:hidden path="product_id" />
					</div>
					<div class="form-group">
						<label for="Product_name">Product Name:</label>
						<form:input path="Product_name" id="Product_name" class="form-control" />
					</div>
					<div class="form-group">
						<label for="description">Description:</label>
						<form:input path="description" id="description" class="form-control" />
					</div>
					<div class="form-group">
						<label for="price">Price:</label>
						<form:input path="price" id="price" class="form-control" />
					</div>
					<div class="form-group">
						<label for="Pquantity">Quantity:</label>
						<form:input path="Pquantity" id="Pquantity" class="form-control" />
					</div>
					<div class="form-group">
						<label for="cid">Category Id:</label>
						<form:input path="cid" id="cid" class="form-control" />
					</div>
					<div class="form-group">
						<input type="submit" value="Edit Save" class="btn btn-primary" />
					</div>
				</form:form>
			</div>
		</div>
	</div>
</body>
</html>
 

		<%-- <h1>Edit Product</h1>
       <form:form method="POST" action="/Inventory/editsaveproduct">  
      	<table >  
      	<tr>
      	<td></td>  
         <td><form:hidden  path="product_id" /></td>
         </tr>
         <tr>  
          <td>Product Name : </td> 
          <td><form:input path="Product_name"  /></td>
         </tr>  
         <tr> 
         <tr>  
          <td>Description : </td> 
          <td><form:input path="description"  /></td>
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
          <td><form:input path="cid" /></td>
         </tr> 
         
         <tr>  
          <td> </td>  
          <td><input type="submit" value="Edit Save" /></td>  
         </tr>  
        </table>  
       </form:form>   --%>
