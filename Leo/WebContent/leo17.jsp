<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page errorPage="leo18.jsp" %>   <!-- 如果有錯誤發生的話麻煩把頁面轉到18.jsp -->    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	int a = 10, b= 02;
	out.println( a / b );
%>

</body>
</html>