<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <%
  session.setAttribute("user", "postgres");
  request.setAttribute("pass", "root");
  %>
  
  <h1>UserName is :${user}</h1>
  <h1>Password is : ${pass}</h1>
</body>
</html>