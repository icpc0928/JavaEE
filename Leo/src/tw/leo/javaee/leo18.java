package tw.leo.javaee;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/leo18")
public class leo18 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		ServletContext context = getServletContext();
		String viewPath = context.getInitParameter("viewPath");     //（初始參數）放在我想要的路徑 (為了方便維護）
		System.out.println(viewPath);
			
	}

}
