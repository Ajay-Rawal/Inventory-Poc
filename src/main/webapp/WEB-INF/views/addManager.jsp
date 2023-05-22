<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<html>
<head>


<style>
    body {

            background-image: url("https://images.pexels.com/photos/4144294/pexels-photo-4144294.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1");
            background-repeat: no-repeat;
            background-size: cover;
            /* Additional CSS properties */
           }
           </style>

<!-- Bootstrap CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">

<!-- Bootstrap JS -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>

<meta charset="ISO-8859-1">
<div class="container">
  <div class="row justify-content-center">
    <div class="col-md-6">
      <div class="card">
        <div class="card-body">
          <h1 class="text-center mb-4">Add New Manager</h1>
          <form:form method="post" action="save">  
          <%--   <div class="form-group">
              <label for="userId">User Id:</label>
              <form:input path="userId" id="userId" class="form-control" />
            </div>   --%>
            <div class="form-group">
              <label for="username">User Name:</label>
              <form:input path="username" id="username" class="form-control" />
            </div> 
            <div class="form-group">
              <label for="password">Password:</label>
              <form:input path="password" id="password" class="form-control" />
            </div> 
            <div class="form-group">
              <label for="email">Email:</label>
              <form:input path="email" id="email" class="form-control" />
            </div> 
            <div class="form-group">
              <label for="role">Role:</label>
              <form:input path="role" id="role" value="MANAGER" class="form-control" />
            </div> 
            <div class="form-group text-center">
              <button type="submit" class="btn btn-primary btn-block mt-4">Save</button>  
            </div>  
          </form:form>  
        </div>
      </div>
    </div>
  </div>
</div>
</head>
</html>










	<%-- 	<h1>Add New Manager</h1>
       <form:form method="post" action="save">  
      	<table >  
         <tr>  
          <td>User Id : </td> 
          <td><form:input path="userId"  /></td>
         </tr>  
         <tr>  
          <td>User Name :</td>  
          <td><form:input path="username" /></td>
         </tr> 
         <tr>  
          <td>Password :</td>  
          <td><form:input path="password" /></td>
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
          <td><input type="submit" value="Save" /></td>  
         </tr>  
        </table>  
       </form:form>  
	 --%>
