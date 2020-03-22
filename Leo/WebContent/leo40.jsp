<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="tw.leo.myutils.leoAPI"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Leo's big crop.</h1>
<hr>

	<c:if test='${param.n == "100" }' var="result">
	網址後面加上?n=100<br>
	</c:if> 
	${result }
	<hr>
	
	<c:set var= "score">${leoAPI.randomScore() }</c:set>
	Score: ${score }<br>
	
	<c:choose>
		<c:when test="${score >= 90 }">A</c:when>
		<c:when test="${score >= 80 }">B</c:when>
		<c:when test="${score >= 70 }">C</c:when>
		<c:when test="${score >= 60 }">D</c:when>
		<c:otherwise>E</c:otherwise>
	</c:choose>
	
	
</body>
</html>