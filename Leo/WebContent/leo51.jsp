<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="tg" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<tg:sayHello user="Leo"></tg:sayHello>
<tg:calc x="10" y="3">
10 + 3 = ${add }  <br>
10 - 3 = ${sub }	<br>
10 * 3 = ${multiply }<br>
10 / 3 = ${divide }	<br>
</tg:calc>


<tg:dojsp/>

<hr>

<table border="1" width="100%">
	<tr>
		<th>Product name</th>
		<th>price</th>
		
	</tr>
	<tg:myjsp name="Camera" price="1,000"/>
	<tg:myjsp name="Mouse" price="200"/>
	<tg:myjsp name="iPhone" price="33,000"/>
</table>









</body>
</html>