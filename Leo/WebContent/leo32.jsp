<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<form action="leo32.jsp" >
	<input type="number" name="x" value="${param.x }" />
	+
	<input type="number" name="y" value="${param.y }" />
	<input type="submit" value="=" />  
	${param.x + param.y }
	<!-- 因為有運算＋所以初始會是0 -->
	
</form>
</body>
</html>