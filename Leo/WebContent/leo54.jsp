<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	
	if(session.isNew() ||
			request.getParameter("account") == null || request.getParameter("passwd") == null){
		response.sendRedirect("leo53.jsp");
		//如果session是新的狀態 or 帳號密碼沒打的話 帶回leo53重新登入頁面 如果有打就return繼續
		return;
	}
	
	String account = request.getParameter("account");
	String passwd  = request.getParameter("passwd");
	if (account.equals("icpc0928") && passwd.equals("123")){
		// Login Good
		session.setAttribute("account", account);
		response.sendRedirect("leo55.jsp");
	}else {
		// Login nogood
		response.sendRedirect("leo53.jsp");
	}
	
	
%>
