package tw.leo.javaee;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class leo03
 */
@WebServlet("/leo03")
public class leo03 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		String account = request.getParameter("account");  //取得參數
		String passwd = request.getParameter("passwd");
		String gender = request.getParameter("gender");
//		String like = request.getParameter("like");
		String area = request.getParameter("area");
		String memo = request.getParameter("memo");
		
		
		String[] likes = request.getParameterValues("like");
		System.out.println(account + " : " + passwd + " : " + gender +" : "  + area + " : " + memo);
		if(likes != null) {
		for (String like : likes) {
			System.out.println(like);
		}}
		
	}

	

}
