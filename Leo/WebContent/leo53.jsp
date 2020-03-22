<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	if (!session.isNew()){
		if(session.getAttribute("account")!=null){
			response.sendRedirect("leo55.jsp");
			//你有session 而且你有帳號,就不要進來登入頁面了直接去 主頁面
		}else{
			response.sendRedirect("logout.jsp");
			//你的帳密亂了 就直接幫你登出吧
		}
		
	}
	%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="leo54.jsp">
		Account:<input type="text" name="account" /><br> 
		Password:<input	type="password" name="passwd" /><br> 
		<input type="submit" value="login" /><br>
	</form>
</body>
</html>