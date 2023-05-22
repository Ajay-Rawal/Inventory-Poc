<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!-- Bootstrap CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">

<!-- Bootstrap JS -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<div class="container">
  <h1 class="my-4">Edit Manager</h1>
  <form:form method="POST" action="/Inventory/editsave" class="my-4">
    <div class="row mb-3">
      <label for="userId" class="col-sm-2 col-form-label">User Id :</label>
      <div class="col-sm-10">
        <form:input path="userId" />
      </div>
    </div>
    <div class="row mb-3">
      <label for="username" class="col-sm-2 col-form-label">User Name :</label>
      <div class="col-sm-10">
        <form:input path="username" class="form-control" />
      </div>
    </div>
    <div class="row mb-3">
      <label for="password" class="col-sm-2 col-form-label">Password :</label>
      <div class="col-sm-10">
        <form:input path="password" class="form-control" />
      </div>
    </div>
    <div class="row mb-3">
      <label for="email" class="col-sm-2 col-form-label">Email :</label>
      <div class="col-sm-10">
        <form:input path="email" class="form-control" />
      </div>
    </div>
    <div class="row mb-3">
      <label for="role" class="col-sm-2 col-form-label">Role :</label>
      <div class="col-sm-10">
        <form:input path="role" class="form-control" />
      </div>
    </div>
    <div class="row mb-3">
      <div class="col-sm-10 offset-sm-2">
        <input type="submit" value="Edit Save" class="btn btn-primary" />
      </div>
    </div>
  </form:form>
</div>












		<%-- <h1>Edit Manager</h1>
       <form:form method="POST" action="/Inventory/editsave">  
      	<table >  
      	<tr>
      	<td></td>  
         <td><form:hidden  path="userId" /></td>
         </tr> 
          <tr>  
          <td>User Name : </td> 
          <td><form:input path="username"  /></td>
         </tr>  
         <tr> 
         <tr>  
          <td>Password : </td> 
          <td><form:input path="password"  /></td>
         </tr>  
         <tr>  
          <td>Email :</td>  
          <td><form:input path="email" /></td>
         </tr> 
         <tr>  
          <td>Role :</td>  
          <td><form:input path="role" /></td>
         </tr> 
         
         <tr>  
          <td> </td>  
          <td><input type="submit" value="Edit Save" /></td>  
         </tr>  
        </table>  
       </form:form>  --%> 