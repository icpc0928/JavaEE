<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//taglib 標籤庫  ,JSTL
	//tomcat taglib download

%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="member1" class="tw.leo.beans.Member"></jsp:useBean>  <!-- 已經從網址上取額物件實體 並作出member1 -->


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstl</title>
</head>
<body>
	
	<%
	//pageContext.setAttribute("x", "123");
	%>
	
	<c:set var="x" value="123" scope="page" />
	x = ${x }<br>
	<c:set var="x" value="456" scope="request" />
	x = ${requestScope.x }<br>
	
	<c:out value="Hello, World" /> <br>
	<c:out value="${'hello, world' }"/> <br>
	<c:out value="${y}" default="no y QQ"/> <br>
	${y != null ? y : "no value" } <br>
	
	<c:set var="var1">9487</c:set>
	<c:out value="${var1}" default="none"/> <br>
	<hr>
	
	${member1 } <br>
	<c:set target="${member1 }" property="account">icpc0928</c:set>
	<c:set target="${member1 }" property="age">28</c:set>
	<c:set target="${member1 }" property="realname" value="leo hsu"></c:set> 
	
	${member1.account }:${member1.realname }:${member1.age } <br>
	移除之前${member1 } <br>
	<c:remove var="member1"/>
	移除之後就不見惹${member1 } <br>
	
	
	
	
	
	
	
	
	
</body>
</html>