<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// cookie ==> client客戶端
	// session ==> server端 ＝不要用太多巳服器負擔大
	if(session.getAttribute("account")==null){
		response.sendRedirect("leo53.jsp");
		return;
	}



%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Leo big corp.</h1>
Welcome, ${account }
<hr>
<a href="logout.jsp">Logout</a>
</body>
</html>