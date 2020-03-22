<%@page import="tw.leo.myutils.leoAPI"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<form action="leo37.jsp" >
	<input type="number" name="x" value="${param.x }" />
	<select name="op">
		<option value = "1" ${(param.op == "1")?"selected":""}>+</option>
		<option value = "2" ${(param.op == "2")?"selected":""}>-</option>
		<option value = "3" ${(param.op == "3")?"selected":""}>*</option>
		<option value = "4" ${(param.op == "4")?"selected":""}>/</option>
		
		
	</select>
	<input type="number" name="y" value="${param.y }" />
	<input type="submit" value="=" />  
	<%-- ${param.x + param.y } --%>
	${leoAPI.calc(param.x , param.y , param.op) } <br>
	<!-- 因為有運算＋所以初始會是0 -->
	
</form>
</body>
</html>