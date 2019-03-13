<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table border="2" width="70%" cellpadding="2">  
<tr><th>Id</th><th>Name</th><th>Age</th><th>Department</th></tr>  
   <c:forEach var="stud" items="${list}">   
   <tr>  
    
   <td>${stud.name}</td>  
   <td>${stud.age}</td>  
   <td>${stud.department}</td>  
   </tr>  
   </c:forEach>  
   </table>  
   
</body>
</html>