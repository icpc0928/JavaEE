package tw.leo.javaee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;

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
		
		
			request.setCharacterEncoding("UTF-8");
		
//			BufferedReader reader = request.getReader();
//			String line;
//			while((line = reader.readLine()) != null) {
//				System.out.println(line);
//			}
//			reader.close();
			
			InputStream in = request.getInputStream();
			byte[] buf = new byte[4096]; int len;
			while((len = in.read(buf))!= -1) {
				System.out.println(new String(buf,0,len));
			}
			in.close();
			
			System.out.println("-------");
			String OK = request.getParameter("OK");
			System.out.println(OK);
			
	
}
	
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doGet(request, response);
	}
}
