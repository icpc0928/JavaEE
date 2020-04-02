package tw.leo.javaee;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class leo07
 */
@WebServlet("/leo07")
@MultipartConfig(location = "/Users/leoru/git/repository/Leo/WebContent/upload") //也可以直接指定存擋路徑
public class leo07 extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//我們要在這裡接收資料
		request.setCharacterEncoding("UTF-8");
		
	    String prefix =	request.getParameter("prefix");
	    System.out.println(prefix);
		
		
		//  /Users/leoru/git/repository/Leo/WebContent/upload
		
		
//		File uploadDir = new File("/Users/leoru/git/repository/Leo/WebContent/upload");    //(如果上面有指定路徑了這裡可不用、但如果儲存路徑很多就要寫在這裡
		
		// 寫下面這行的意思就是要處理enctype = "multipart/form-data" 這件事情
		// MUST BE =>上面一定要加上@MultipartConfig  並且import
		Collection<Part> parts =  request.getParts();    //java.util的Collection （import要找對）

		int i =1;
		for (Part part : parts) {
			String name = part.getName();
			String sname = part.getSubmittedFileName();  //同個路徑同個檔案在不同瀏覽器顯示的會不一樣的（ＩＥ是路徑）
			
			if(name.equals("upload")) {
				if(sname.length() == 0) continue;
				part.write(createFileName(prefix,i++));
			}
			
//			System.out.println(name + " : " + sname);

			
//			InputStream in =  part.getInputStream();		//抓取檔案
//			byte[] buf = new byte[(int)part.getSize()];
//			in.read(buf);
//			in.close();
//			
//			FileOutputStream fout = 						//把檔案傳到upload 路徑的資料夾
//					new FileOutputStream(new File(uploadDir, sname));
//			fout.write(buf);
//			fout.flush();
//			fout.close();
			
//			part.write(sname);						//在@multipartconfig後面直接給上路徑 只要寫這樣就好 上面就省了）
			
			
			
		}
	}
	
	private String createFileName(String fname ,int i) {
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		return fname + year + "_" + month +"_"+day + "_" + i + ".jpg";
	}

}
