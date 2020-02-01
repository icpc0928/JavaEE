package tw.leo.javaee;

import java.io.BufferedReader;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class leo04
 */
@WebServlet("/leo04")
public class leo04 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
			BufferedReader reader = request.getReader();
			String line;
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			reader.close();
	

}
}
