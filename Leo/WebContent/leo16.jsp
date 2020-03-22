<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
	String result = "";
	String x = request.getParameter("x");
	String y = request.getParameter("y");
	String op = request.getParameter("op");
	if (op == null) op = "";
	if (x != null && y != null){
		try{
			int intX = Integer.parseInt(x);		
			int intY = Integer.parseInt(y);
			int intResult = 0;
			switch (op){	// byte, short, int, char, String
				case "1": intResult = intX + intY; break;
				case "2": intResult = intX - intY; break;
				case "3": intResult = intX * intY; break;
				case "4": intResult = intX / intY; break;
			}
			result = intResult + "";
		}catch(Exception e){
			result = " ...... "; 						
		}
	}else{
		x = y = "";
	}
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<script>
function checkForm(){
	// 前端檢查機制
	return false;
</script>
<form action="leo16.jsp" onsubmit="return checkForm()">
	<input type="number" name="x" value="<%= x %>" required min="0" />
	<select name="op">
		<option value="1" <% out.print(op.equals("1")?"selected":""); %>>+</option>
		<option value="2" <% out.print(op.equals("2")?"selected":""); %>>-</option>
		<option value="3" <% out.print(op.equals("3")?"selected":""); %>>x</option>
		<option value="4" <% out.print(op.equals("4")?"selected":""); %>>/</option>
	</select>
	<input type="number" name="y" value="<%= y %>" required />
	<input type="submit" value="=" />
	<%= result %>
</form>
</body>
</html>