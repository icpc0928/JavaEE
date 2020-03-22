<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="tg" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP: functions</title>
</head>
<body>

<c:set var="var1" value="hello, world" />
<c:if test='${fn:contains(var1,"world") }'>
有der
</c:if>

<tg:test1></tg:test1>

</body>
</html>