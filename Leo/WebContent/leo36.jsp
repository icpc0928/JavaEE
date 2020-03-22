<%@page import="tw.leo.beans.Member"%>
<%@page import="tw.leo.myutils.leoAPI"%>
<%@page import="java.util.*"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String[] var1 = {"a1","a2","a3","a4","a5","a6","a7",};
	pageContext.setAttribute("username", var1);    //字串物件直接塞進去  pageContext 的.set只有ㄧ個方法
	
	String[] var2 = {"b1","b2","b3","b4","b5","b6","b7","b8"};
	request.setAttribute("username", var2);
	
	LinkedList<String> list = new LinkedList<>();
	list.add("AAA"); list.add("BBB");list.add("CCC");
	request.setAttribute("listdata", list);

	HashMap<String,String> map = new HashMap<>();
	map.put("k1","v1"); map.put("k2", "v2"); map.put("k3","v3");
	request.setAttribute("map", map);
	
	Member member = new Member();
	member.setAccount("leo");
	member.setAge(22);
	member.setRealname("leo hsu");
	
	request.setAttribute("member", member);
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

username1 = ${username[2] } <br>   <!-- 因為pageContext掌管整頁面 所以直接拿pagecontext內的 username 就有了 -->
username1 = ${username["3"] } <br>  <!-- 用字串也可 -->

username2 = ${requestScope.username[7] } <br> <!-- page < request < session < application 名稱有衝突才要用到Scope--> 
<%= var2[3] %> <br>

list0= ${listdata[0] }<br>
list(?i=2)= ${listdata[param.i] }<br>
list= ${listdata[1] }<br>

map1= ${map["k1"] } <br>
map2= ${map.k2 } <br>   <!-- 因為是map內直接擁有的元素 -->
map(?key=3)= ${map[param.key] } <br>

Lottery1: <%= leoAPI.createLottery() %> <br>
lottery2: ${leoAPI.createLottery() } <br>
lottery3: ${Math.random() }

Hello(?name=安安): ${leoAPI.sayHello(param.name) } <br>

${10 + 3 }<br>
${param.x } > ${param.y } => ${param.x > param.y } <br>  <!-- 字串內互相比較 10 跟3比的話會先用1 跟3比 所以 10<3 9>3 -->
${(param.x == "10")?"Yes": "No"} <br>
${10>3 } <br>

Account: ${member.account }<br> <!-- member.getAccount()這個方法被呼叫 -->
Age:  ${member.age }<br>
Realname: ${member.realname }
<!-- 也可以使用物件的觀念來呼叫 -->




</body>
</html>