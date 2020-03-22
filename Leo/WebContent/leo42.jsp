<%@page import="tw.leo.myutils.BCrypt"%>
<%@page import="java.util.Properties"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.sql.*"%>
<c:catch var="errMesg">

<%
	String passwd = BCrypt.hashpw("123456", BCrypt.gensalt());

	
	Class.forName("com.mysql.cj.jdbc.Driver");	

	Properties prop = new Properties();
	prop.put("user","root");
	prop.put("password","root");
	prop.put("serverTimezone", "Asia/Taipei");
	Connection conn = DriverManager.getConnection(
			"jdbc:mysql://localhost:8889/iii",prop);
	
	String sql= "INSERT INTO cust (account,passwd) VALUES (?,?)";
	PreparedStatement pstmt = conn.prepareStatement(sql);
	pstmt.setString(1, "helloleo42");
	pstmt.setString(2, passwd);
	pstmt.executeUpdate();
	
	
%>
</c:catch>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>五星級重要 ver1</title>
</head>
<body>
	<c:if test="${errMesg != null  }">${errMesg }</c:if>

</body>
</html>