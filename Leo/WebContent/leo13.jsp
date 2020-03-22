<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>九九乘法表</title>
</head>
<body>
<table border="1" width="100%">
<%
	for(int k =0 ;k<2 ; k++){
		out.println("<tr>");
		for(int j=2+k*4 ; j<=5+k*4 ; j++){
			out.println("<td>");
			for(int i = 1; i<=9 ; i++){
				int r = j*i;
				out.println(String.format("%d x %d = %d <br> ", j,i,r));
				
				
			}
			out.println("</td>");
		}
		out.println("</tr>");
	}


%>
</table>
</body>
</html>