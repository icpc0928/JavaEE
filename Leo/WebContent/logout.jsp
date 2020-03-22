<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	session.invalidate(); //session無效丟掉
	response.sendRedirect("leo53.jsp");
%>