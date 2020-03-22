package tw.leo.javaee;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/leo20")
public class leo20 extends HttpServlet {
	
	private static final String sql =
			"SELECT * FROM cust WHERE account = ?";  //用帳號找那串哈希瑪
	
	private static  PreparedStatement pstmt;
	
	private boolean isMysqlOK;
	
	public leo20() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 把驅動程式放在 WebContent/WEB-INF/lib/mysql-connector-java-8.0.19.jar
			// 這個驅動 去網路搜尋 mysql connector
			//			System.out.println("OK");
			
			//連線資料庫的動作
			Properties prop = new Properties();
			prop.put("user", "root");
			prop.put("password", "root");
			prop.put("serverTimezone", "Asia/Taipei");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:8889/iii", prop);
//			 sql = 	"INSERT INTO cust (account,passwd) VALUES (?,?)";
			 pstmt = conn.prepareStatement(sql);
			 isMysqlOK = true;
			
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");   	//基本動作
		PrintWriter out = response.getWriter();					//基本動作
		request.setCharacterEncoding("UTF-8");					//基本動作
		
		String account = request.getParameter("account");
		String passwd = request.getParameter("passwd");
		
		if(account == null || !isMysqlOK) {
			
			response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Server Busy!");   //連線沒成功導入的頁面
			return;
		}
		
		boolean isAccountOK = checkAccount(account,passwd);  
		if(isAccountOK) {
			out.println("bug1");
			response.sendRedirect("main.html");//帳密正確轉向到main畫面     (sendError是錯誤頁面 sendRedirect是轉向頁面）
		}else {
			out.println("bug2");
			response.sendRedirect("leo07.html"); //帳密打錯回到原點的頁面
		}
		
	}

	private boolean checkAccount(String account, String passwd) {   //檢查帳密穩步吻合
		boolean isPWOK = false;
		try {
			pstmt.setString(1, account);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {		//如果有下一筆資料就做
				System.out.println("bug3isgood");
				String hashPW = rs.getString("passwd");  //從資料庫撈出密碼資料
				System.out.println(hashPW);
				
				isPWOK = leoAPIs.chPassword(passwd, hashPW);  //我們多做一個class叫 leoAPIs 做比較兩個密碼比對
				
			}else {
				System.out.println("bug4");
			}
		}catch(Exception e ) {
			System.out.println("bug5打錯帳號的話表示sql語法有錯");
			System.out.println(e.toString());
		}
		return isPWOK;
		
	}
	
	
}
