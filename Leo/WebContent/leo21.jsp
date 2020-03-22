
<%

//String name = request.getParameter("name");  //這裡就不用在宣告了因為leo20裡面已經有惹 這樣include會把原本的物件交給20繼續做   ,重複宣告會出事
	String lottery = (String)(request.getAttribute("lottery"));

%>


<div style="background-color: rgb(255,255,0)">
hello, <%= name %><br>      <!-- 這裏的name雖然沒有宣告但是在20已經有宣告了所以include進去沒問題 -->
==> <%= lottery %>
<br>
<%=(String)(pageContext.getAttribute("key1"))  %>
</div>