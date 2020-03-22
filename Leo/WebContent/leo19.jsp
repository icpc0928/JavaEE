<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- JSP也可以做import -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 簡單的日期（現在日期（伺服器的，如果是用ＪＳ寫會是用戶端的時間）） -->
Today: <%
	Calendar now = Calendar.getInstance();
	int year =  now.get(Calendar.YEAR);
	int month = now.get(Calendar.MONTH)+1;
	int day = now.get(Calendar.DAY_OF_MONTH);
	out.print(String.format("%d - %d - %d",year,month,day));


%>

</body>
</html>