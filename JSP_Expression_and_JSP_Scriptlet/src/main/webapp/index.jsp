<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
   
   <%!
        public int square(int a)
        {
         return a * a;
        }
   
     %>
     
    
    <%
        out.println(square(10));
     %>
    
</body>
</html>