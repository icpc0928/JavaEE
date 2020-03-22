<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
	<sql:setDataSource 
		driver="com.mysql.cj.jdbc.Driver"
		url="jdbc:mysql://localhost:8889/iii?serverTimezone=Asia/Taipei"
		user="root" 
		password="root" 
		/>
<c:if test="${!empty param.account }">
	<sql:update>
		UPDATE cust set account = ? , passwd= ? , realname= ? WHERE id = ?
		<sql:param> ${param.account }</sql:param>
		<sql:param>${param.passwd }</sql:param>
		<sql:param>${param.realname }</sql:param>
		<sql:param>${param.updateid }</sql:param>
	</sql:update>
	<c:redirect url="leo45.jsp"></c:redirect>
	
</c:if>

<sql:query var="result">
	SELECT * FROM cust WHERE id = ?
	<sql:param>${param.editid }</sql:param>
	
</sql:query>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="leo47.jsp" >
	<input type = "hidden" name="updateid" value="${param.editid }">
	Account: <input type="text" name="account" value="${result.rows[0].account }"/><br>   
	Password: <input type="password" name="passwd" value="${result.rows[0].passwd }" /><br>
	Realname: <input type="text" name="realname"  value="${result.rows[0].realname }"/><br>
	<input type="submit" value="Update" /><br>
</form>

</body>
</html>