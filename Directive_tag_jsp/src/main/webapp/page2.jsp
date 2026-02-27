<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%

session.setAttribute("User","postgress");


%>

<h1>UserName : <%= session.getAttribute("User") %></h1>
</body>
</html>