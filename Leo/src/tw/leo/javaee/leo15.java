package tw.leo.javaee;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//controller

@WebServlet("/leo15")
public class leo15 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//0. prepare
		String x = request.getParameter("x");
		String y = request.getParameter("y");
		String op = request.getParameter("op");
		if (x == null) x = "0";
		if (y == null) y = "0";
		if (op == null) op = "1";		//view2的select
		
		//1. model
		leo16 model = new leo16(x,y , op);
		double result = model.operation();
		
		//2. view
		RequestDispatcher dispatcher =
				request.getRequestDispatcher(
						String.format(
								"leo17?x=%s&op=%s&y=%s&result=%s&filename=%s", 
								x,op,y,result,"view2.html"));					
		//17號的x 跟y中間有四個op只需要在17號處理就好‘這裡只給一個op即可
																				
		dispatcher.forward(request, response);
		
	}

	

}


