<%@ tag import="java.util.*" %>
<%@ tag dynamic-attributes="product"  %>
<% 
	HashMap<String , String> ps = 
			(HashMap<String , String>)jspContext.getAttribute("product");
		out.println("<tr>");
		
		out.println("<td>");
		out.println(ps.get("name"));
		out.println("</td>");
		
		out.println("<td>");
		out.println(ps.get("price"));
		out.println("</td>");
		
		out.println("</tr>");
	

%>