package tw.leo.javaee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/leo11")
public class leo11 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name  = request.getParameter("name");
		if (name == null ) {
			name = "world";
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("leo12?name="+name); 
		// 拿(get) request來調度(dispa...)  拿去leo12   //且可以用url的寫法 要帶入leo12的參數
		
		
		

		response.setContentType("text/html; charset=UTF-8"); // 要求
		PrintWriter out = response.getWriter(); // 回應

		out.println("<h1>Leo Big Comp</h1><hr />");

		dispatcher.include(request, response);  //  這段才會將leo12那行執行起來
		
		dispatcher = request.getRequestDispatcher("leo05.html");
		dispatcher.include(request, response);
		
		out.println("hihihihihihi<hr />");
	}

}
