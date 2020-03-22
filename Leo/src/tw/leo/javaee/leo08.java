package tw.leo.javaee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class leo08
 */
@WebServlet("/leo08")
public class leo08 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=UTF-8");  //我說我以下的內容為html
		PrintWriter out = response.getWriter();
		out.println("hello1 <br>");
		out.println("hello2");
		
//		System.out.println("hello, world");
		
	}

	

}
