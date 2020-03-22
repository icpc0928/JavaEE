<%@page import="javax.servlet.jsp.jstl.sql.Result"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/sql" prefix="sql"  %>
<sql:setDataSource
	driver="com.mysql.cj.jdbc.Driver"
	url="jdbc:mysql://localhost:8889/iii?serverTimezone=Asia/Taipei"
	user="root" 
	password="root" />
<sql:query var="rs1">
SELECT * FROM opendata
</sql:query>

<c:set var="rpp" value="10"></c:set>
<%
/* Result要import對  (強制將rs1物件轉型為Result) */
	Result result = (Result)pageContext.getAttribute("rs1");
/* 再轉型為 int */
	int rowCount = result.getRowCount();
/* rpp是String 將它轉為int才能做運算 */
	int rpp = Integer.parseInt((String)pageContext.getAttribute("rpp"));
	int pages = rowCount % rpp == 0 ? rowCount/rpp : rowCount/rpp +1 ; //int==>Integer
	pageContext.setAttribute("pages", pages);
%>

<c:set var="page" value="${param.page == null ? 1 : param.page }"></c:set>
<c:set var="start" value="${rpp * (page - 1) }"></c:set>
<c:set var="prev" value="${page == 1 ? 1 :page - 1 }"></c:set>
<c:set var="next" value="${page == pages  ? page : page + 1 }"></c:set>

<sql:query var="result">

SELECT * FROM opendata limit ${start }, ${rpp }
</sql:query>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
總頁數${pages }<br>
本頁筆數： ${result.rowCount }
<hr>
<a href="?page=${prev }">Prev</a> | <a href="?page=${next }">Next</a>
<table border="1" width="100%">
	<tr>
	<th>ID</th>
	<th>Name</th>
	<th>Address</th>
	<th>Tel</th>
	<th>LatLng</th>
	<th>Picture</th>
	<th></th>
	</tr>
	<c:forEach items="${result.rows }" var="row">
		<tr>
			<td>${row.id }</td>
			<td>${row.cname }</td>
			<td>${row.address }</td>
			<td>${row.tel }</td>
			<td>${row.latlng }</td>
			<td><img src="${row.picurl }" width="128px" height="72px"></td>
		</tr>
	</c:forEach>
</table>




</body>
</html>