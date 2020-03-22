<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String name = request.getParameter("name");
	if(name == null) name = "OK";
	/* setArrtibute  我在20設定一個屬性 讓21去拿 */
	request.setAttribute("lottery",(int)(Math.random()*49+1)+"");
	
	pageContext.setAttribute("key1", "value1");
	
	
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
<%@ include file ="leo21.jsp" %>     <!-- include導入其他頁面原始碼（全部,所以leo21裡面沒放標頭等等（不然都會被拿進來） -->
<hr>
<%= (String)(pageContext.getAttribute("key1"))  %>


</body>
</html>