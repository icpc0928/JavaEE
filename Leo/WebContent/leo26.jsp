<%@page import="tw.leo.javaee.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Member member = (Member)application.getAttribute("member");
				
	member.addAge();
				  
%>    
     <!--           (Member)=>(強制轉型) -->
    
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%=member.getAccount() %>
<%=member.getAge() %>
</body>
</html>