<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>Save Customer</head>

<body>

<div id="wrapper" >

<div id ="header">
<h2>  CRM  -Customer RelationShip Manager</h2>
</div>
</div>


<div id="content" >
<h3>Save Customer</h3>
<form:form   action="saveCustomer" modelAttribute="customer"  method="POST"> 


    <form:hidden path="id"  />
<table>

   <tbody>
   
      <tr>
          <td><label>FirstName:</label></td>
          <td><form:input path="firstName" /></td>
      </tr>
      
      <tr>
          <td><label>LastName:</label></td>
          <td><form:input path="lastName" /></td>
      </tr>
      
      <tr>
          <td><label>Email:</label></td>
          <td><form:input path="email" /></td>
      </tr>
      
      <tr>
          <td><label></label></td>
          <td><input type="submit" value="Save" /> </td>
      </tr>

   </tbody>


</table>

</form:form>
</div>
<div id="clear">
</div>
<p>
<a href="${pageContext.request.contextPath}/customer/list">Back to List</a>

</p>
</div>





</div>




<br><br>


</body>

</html>