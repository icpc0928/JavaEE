package tw.leo.javaee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/leo12")
public class leo12 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.setContentType("text/html; charset=UTF-8"); // 要求
		
		String name = request.getParameter("name");    //leo11的 帶參數進入
		
		PrintWriter out = response.getWriter(); // 回應

		out.println("hello, " + name + "<hr />");
		
		
	}

	
}
