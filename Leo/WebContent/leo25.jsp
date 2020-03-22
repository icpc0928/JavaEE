<%@page import="tw.leo.javaee.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% 
	Member member = new Member("icpc0928","LeoHsu",19);
	//這裏只創會員的物件實體
	//學 application
	application.setAttribute("member", member);
	//application.setAttribute(key,object)  member就是我們創的物件實體
	

%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>