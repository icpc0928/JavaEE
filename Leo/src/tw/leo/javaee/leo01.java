package tw.leo.javaee;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class leo01
 */
@WebServlet("/leo01")
public class leo01 extends HttpServlet {
	


	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		Enumeration<String> headers = request.getHeaderNames();	//呼叫
		while (headers.hasMoreElements()) {
			String key = headers.nextElement();			//key value 拿到這個key的名稱
			String value = request.getHeader(key);		//這個key內的值（屬性）
			System.out.println(key + " = " + value);
			
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doGet(request,response);
		
	}

}
