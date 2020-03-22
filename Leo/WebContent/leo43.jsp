<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page errorPage="error.jsp"%>
<%@ page import="java.sql.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>五星級重要 ver2</title>
</head>
<body>

	<sql:setDataSource 
		driver="com.mysql.cj.jdbc.Driver"
		url="jdbc:mysql://localhost:8889/iii?serverTimezone=Asia/Taipei"
		user="root" 
		password="root" />
	<sql:update>
	INSERT INTO cust (account,passwd) VALUES('Tony','a2223')  <!-- 新增到資料庫 -->
	</sql:update>

	
</body>
</html>