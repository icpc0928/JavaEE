<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String var1 = request.getParameter("var1");
	String var2 = request.getParameter("var2");

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

I am page 28 <br>
var1 =	<%=var1 %> <br>
var2 =  <%=var2 %>


</body>
</html>