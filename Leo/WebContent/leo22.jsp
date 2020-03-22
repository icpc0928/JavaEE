<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 完全無關的網頁 所以key抓不到任何資料 會是 null -->
<%=(String)(pageContext.getAttribute("key1"))  %>

</body>
</html>