<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hi welcome back</h1>

 <table >
 <thead>
 <th> Id</th>
 <th> firstname</th>
 <th>lastname</th>
 <th>address</th>
  <th>employeeid</th>
 </thead>
 <tbody>
 <c:forEach var="employee" items="${employees}">
 <tr>
 <td>${employee.id }</td>
 <td>${employee.firstname }</td>
 <td>${employee.lastname }</td>
 <td>${employee.address }</td>
  <td>${employee.employeeid }</td>
 
 <td>
 </td>
 </tr>
 </c:forEach>
 </tbody>
 </table>
</body>
</html>