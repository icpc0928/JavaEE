<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
int lottery1 = (int)(Math.random()*49+1);
int lottery2 = (int)(Math.random()*49+1);
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Leo Big Corp.</h1>
<hr>
<!-- 如果我在網頁末端加上 ?name=xxxxx -->

<!-- 這裏是定義request的參數parameter -->
<jsp:include page="leo24.jsp">
	<jsp:param  name="key1" value="<%= lottery1 %>"/>
	<jsp:param  name="key2" value="<%= lottery2 %>"/>
	
</jsp:include>


</body>
</html>