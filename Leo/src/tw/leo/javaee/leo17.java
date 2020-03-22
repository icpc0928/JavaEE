package tw.leo.javaee;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//負責輸出
@WebServlet("/leo17")
public class leo17 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		String x = request.getParameter("x");
		String op = request.getParameter("op");
		String y = request.getParameter("y");
		String result = request.getParameter("result");
		String filename = request.getParameter("filename");
		
		String op1 = op.equals("1")?"selected":"";
		String op2 = op.equals("2")?"selected":"";
		String op3 = op.equals("3")?"selected":"";
		String op4 = op.equals("4")?"selected":"";
		
		
		String html = loadView(filename);
		out.print(String.format(html, x,op1,op2,op3,op4,y,result ));
		response.flushBuffer();
		
	}
	
	private String loadView(String filename) {
		ServletContext context = getServletContext();
		String viewPath = context.getInitParameter("viewPath");     //（初始參數）放在我想要的路徑 (為了方便維護）
		
		StringBuffer sb = new StringBuffer();
		try {
		BufferedReader reader =
				new BufferedReader(new FileReader(
						new File(viewPath, filename)));
		String line ;
		while((line = reader.readLine())!= null) {
			sb.append(line + "\n");
		}
		
		
			reader.close();
		}catch(Exception e) {
			
		}
		
		return sb.toString();
		
	}

}
