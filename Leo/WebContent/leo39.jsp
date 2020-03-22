<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix= "c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 	<h1>Leo's big crop.</h1>
 	<c:catch var="error">
 	<!-- 跟try catch依樣 會幫你抓到例外 -->
	<%
		String num = request.getParameter("n");
		int n = Integer.parseInt(num);
		out.print(n);
	%>
	</c:catch>
	Hello,world <br>
	
	${error }
</body>
</html>