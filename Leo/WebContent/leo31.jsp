<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%-- <jsp:directiv.page import="tw.leo.beans.Member" />     --%>
    
    
<jsp:useBean id="member" class="tw.leo.beans.Member"></jsp:useBean>
<jsp:setProperty property="account"  value="${param.account }" 	name="member"/>
<jsp:setProperty property="realname" value="${param.realname }" name="member" />
<jsp:setProperty property="age"      value="${param.age }"      name="member" />


<!--   /* 宣告的寫法 */  --> 
<jsp:declaration>

	int  a  ;
	String b;
</jsp:declaration>
<!-- /* 運算的寫法 -->
<jsp:scriptlet>

	a = 10;
	b = "brad";
</jsp:scriptlet>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		Account = 	${member.account } 	<br>
		Realname = 	${member.realname }	<br>
		Age = 		${member.age } 		<br>
		${member }
<%--上面這句等同 <%request.getParameter("account") %> --%>
		
		
a = <jsp:expression>a</jsp:expression>
b = <jsp:expression>b</jsp:expression>
<hr>
Member = <jsp:expression>member</jsp:expression> <br>
Member = <%= member %><br>
Member = ${member}

		
</body>
</html>