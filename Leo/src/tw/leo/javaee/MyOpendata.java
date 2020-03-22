package tw.leo.javaee;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class MyOpendata {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Properties info = new Properties();
			info.put("user","root");
			info.put("password","root");
			info.put("serverTimezone", "Asia/Taipei");
			
			Connection conn = 
					DriverManager.getConnection("jdbc:mysql://localhost:8889/iii",info);
			String sql = 
					"INSERT INTO opendata (cname,address,tel,latlng,picurl) VALUES (?,?,?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			
			URL url = new URL("https://data.coa.gov.tw/Service/OpenData/ODwsv/ODwsvTravelFood.aspx");
			HttpURLConnection hconn = (HttpURLConnection)url.openConnection();
			hconn.connect();
			BufferedReader reader = new BufferedReader(new InputStreamReader(hconn.getInputStream()));
			
			String line ; StringBuffer sb = new StringBuffer();
			while( (line = reader.readLine()) != null) {
				sb.append(line);
			}
			
			reader.close();
			
			
			
			
			
			
			
			System.out.println("OK");
			
		} catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}

