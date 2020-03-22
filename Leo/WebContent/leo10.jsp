<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!-- 用％來插入JSP的語法  -->
<!--  -->
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>Leo Big Corp.</h1>
		<hr>
		<%
			out.println("<h2>Hello, world</h2>");
			out.println("hello, world");
			
		%>
		<hr>
		這期要出的號碼：
		<%
			int lottery = (int)(Math.random()*49+1);
			out.println(lottery);
		%><br>
		這期要出<%= lottery %>
	</body>
</html>