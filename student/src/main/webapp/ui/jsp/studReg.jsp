<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form method="get" action="insert" modelAttribute="student">
   
     <label>Name</label>
      <form:input path="name" type="text"/>
     <label>Age</label>
      <form:input path="age" type="text"/>
     <label>Department</label>
      <form:input path="department" type="text"/>
      <button type="submit" style="width:80px;height:20px" value="Register"></button>
    </form:form>
    
</body>
</html>