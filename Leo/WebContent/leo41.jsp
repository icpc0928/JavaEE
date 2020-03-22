<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String[] names = {"Leo" ,"tony", "andy","may","brad","kai"};
	pageContext.setAttribute("names", names);
	
	/* for(String name: names){ } */
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstl-foreach</title>
</head>
<body>
	<table border="1" width="100%">
		<tr>
			<th>Index</th>
			<th>Names</th>
			<th>Count</th>
			<th>First</th>
			<th>Last</th>
			
		</tr>
		<c:forEach items="${names }" var="name" varStatus="status">
			<tr bgcolor='
				<%-- ${(status.index % 2 == 0)?"yellow":"pink" }  也可以這樣寫--%>
				<c:choose>
					<c:when test="${status.index %2 == 0 }">pink</c:when>
					<c:otherwise>yellow</c:otherwise>
				</c:choose>
			'>
				<td>${status.index}</td>
				<td>${name }</td>
				<td>${status.count}</td>
				<td>${status.first}</td>
				<td>${status.last}</td>
				
			</tr>		
		</c:forEach>
	</table>

</body>
</html>