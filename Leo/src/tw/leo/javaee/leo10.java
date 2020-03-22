package tw.leo.javaee;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class leo10
 */
@WebServlet("/leo10")
public class leo10 extends HttpServlet {
	
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		String x = request.getParameter("x");
		String y = request.getParameter("y");
		String op = request.getParameter("op");
		
		int iX, iY ;
		double result; iX = iY =  0 ;
		result = 0.0;
		if(x != null) {
			try {
				iX = Integer.parseInt(x);
				iY = Integer.parseInt(y);
				switch(op) {
				case "1":result = iX + iY; break;
				case "2":result = iX - iY; break;
				case "3":result = iX * iY; break;
				case "4":result = (iX*1.0) / iY; break;        //整數iX先乘上1.0讓他變成double
				}
				
			} catch(Exception e){}
		
		}
		
		if(op == null ) op = "1";
		
		response.setContentType("text/html; charset=UTF-8");  //我說我以下的內容為html
		PrintWriter out = response.getWriter();
		
		out.append("<h1>Leo Big Comp</h1>")
		.append("<form action='leo10' method='get'>")
		.append("<input type='text' name='x' value='" + iX +"'>")
		.append("<select name='op'>")
		.append("<option value ='1' "+ (op.equals("1")  ?  "selected"  :  "") +" >+</option>")
		.append("<option value ='2' "+ (op.equals("2")  ?  "selected"  :  "") +">-</option>")
		.append("<option value ='3' "+ (op.equals("3")  ?  "selected"  :  "") +">*</option>")
		.append("<option value ='4' "+ (op.equals("4")  ?  "selected"  :  "") +">/</option>")
		.append("</select>")
		.append("<input type='text' name='y' value='" + iY +"'>")
		.append("<input type='submit' value = '=' /> ")
		.append(""+ result)
		.append("</form>");
		response.flushBuffer();
	
	}



}
