package tw.leo.javaee;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;

/**
 * Servlet implementation class leo24
 */
@WebServlet("/leo24")
public class leo24 extends HttpServlet {
	
	public leo24() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 把驅動程式放在 WebContent/WEB-INF/lib/mysql-connector-java-8.0.19.jar
			// 這個驅動 去網路搜尋 mysql connector
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		response.setContentType("application/json; charset=UTF-8");   	//基本動作
		PrintWriter out = response.getWriter();					//基本動作
		
		try {
			JSONArray root = new JSONArray();
			
			//連線資料庫的動作
			Properties prop = new Properties();
			prop.put("user", "root");
			prop.put("password", "root");
			prop.put("serverTimezone", "Asia/Taipei");
			Connection conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:8889/iii", prop);    //如果是port:3306就可以不用寫 寫localhost/iii這樣就好
			String sql = 
					"SELECT * FROM cust";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery(sql);
			
			while(rs.next()) {
				HashMap<String, String> row = new HashMap<>();
				row.put("id",rs.getString("id"));
				row.put("account",rs.getString("account"));
				row.put("passwd",rs.getString("passwd"));
				row.put("realname",rs.getString("realname"));
				
				root.put(row);
			}
			out.print(root.toString());
			
			
			
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
