package tw.leo.javaee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class leo09
 */
@WebServlet("/leo09")
public class leo09 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		response.setContentType("text/html; charset=UTF-8");  //我說我以下的內容為html
		PrintWriter out = response.getWriter();
		
		request.setCharacterEncoding("UTF-8");
		String x = request.getParameter("x");
		String y = request.getParameter("y");
		int iX = Integer.parseInt(x);
		int iY = Integer.parseInt(y);
		int result = iX + iY;
		
		out.println(iX + " + " + iY + " = " + result);
		response.flushBuffer();
		
		
	}



}
