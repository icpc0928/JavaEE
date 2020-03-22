package tw.leo.javaee;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tw.leo.myutils.BCrypt;

@WebServlet("/leo19")
public class leo19 extends HttpServlet {

	public leo19() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 把驅動程式放在 WebContent/WEB-INF/lib/mysql-connector-java-8.0.19.jar
			// 這個驅動 去網路搜尋 mysql connector
//			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");   	//基本動作
		PrintWriter out = response.getWriter();					//基本動作
		request.setCharacterEncoding("UTF-8");					//基本動作
		
		String account = request.getParameter("account");
		String passwd = request.getParameter("passwd");
		
		if(account == null) return;
		
		String hashPW = BCrypt.hashpw(passwd, BCrypt.gensalt());
		int result = add2MySQL(account,hashPW);
		if (result >= 1) {
			out.println("add : " + result);
			response.flushBuffer();
		}
		
	}
	
	private int add2MySQL(String account, String passwd) {
		int ret = 0;
		try {
			//連線資料庫的動作
			Properties prop = new Properties();
			prop.put("user", "root");
			prop.put("password", "root");
			prop.put("serverTimezone", "Asia/Taipei");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:8889/iii", prop);    //如果是port:3306就可以不用寫 寫localhost/iii這樣就好
			String sql = 
					"INSERT INTO cust (account,passwd) VALUES (?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,account); //第一個問號為 account
			pstmt.setString(2,passwd);	//第二個問號為 passwd
			ret =pstmt.executeUpdate();      //傳回有沒有異動？  如果沒有異動成功ret為0 拋出例外也是為0
			
			
			
			
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
		return ret;
		
	}

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}
}
