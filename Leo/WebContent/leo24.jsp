<%
	String name = request.getParameter("name");
	if(name == null) name = "WWWWWWW";
	
	String v1 = request.getParameter("key1");
	String v2 = request.getParameter("key2");
	
	
%>


hello. <%=name %> <br>
<%= v1 %> <br>
<%= v2 %>