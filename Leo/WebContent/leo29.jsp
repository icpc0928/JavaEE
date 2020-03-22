<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!-- 下面class已經有抓member.java了 所以不用import -->


<%--   useBean做的就是這句<% Member member = new Member(); %>  直接產生一個物件實體  --%>
<jsp:useBean id="member" class="tw.leo.beans.Member"></jsp:useBean>
<jsp:setProperty property="account"  value="icpc0928" name="member"/>
<jsp:setProperty property="realname" value="Leo Hsu"  name="member" />
<jsp:setProperty property="age"      value="18"       name="member" />
<!-- 				屬性:			其值為：				哪個物件實體 -->
<!-- member.setAccount("icpc0928") -->

<jsp:useBean id="member2" class="tw.leo.beans.Member"></jsp:useBean>
<jsp:setProperty property="account"  value="tony" 		name="member2"/>
<jsp:setProperty property="realname" value="Tony Chen"  name="member2" />
<jsp:setProperty property="age"      value="44"       	name="member2" />



<!-- set/get屬性 -->
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>



Account: <jsp:getProperty  property="account"  name="member"/> <br>
Realname: <jsp:getProperty property="realname" name="member"/> <br>
Age:      <jsp:getProperty property="age"      name="member"/> <br>

Account: <jsp:getProperty  property="account"  name="member2"/> <br>
Realname: <jsp:getProperty property="realname" name="member2"/> <br>
Age:      <jsp:getProperty property="age"      name="member2"/> <br>


</body>
</html>