package tw.leo.javaee;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//把照片另加浮水印
@WebServlet("/leo22")
public class leo22 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

//		response.setContentType("image/jpeg"); // 等等的檔案為影像檔
		response.setContentType("text/html; charset=UTF-8"); // 等等的檔案為影像檔
		BufferedImage bimg = ImageIO.read(new File("/Users/leoru/git/repository/Leo/WebContent/upload/test.jpeg"));
		Graphics2D g2d = bimg.createGraphics();
		
		Font myfont = new Font(null,Font.BOLD + Font.ITALIC,180);
		
		AffineTransform tran = new AffineTransform();
		tran.rotate(Math.toRadians(30),0,0);
		Font font2 = myfont.deriveFont(tran); //把剛剛的變形（tran)拿去處理font2
		
		//照片有了準備打上浮水印
		//這三行有順序性 要先決定畫筆（顏色字體...）才能draw
		g2d.setColor(Color.yellow);		
		
		g2d.setFont(font2);  //字體null 為預設 ,粗體＋斜體,48px
		g2d.drawString("Hello, world", 2000	,1500 );
		g2d.drawString("安安你好",2222,00);
		
		
		
		//最後作成輸出所以OutputStream先不用惹）
		FileOutputStream fout = new FileOutputStream(new File("/Users/leoru/git/repository/Leo/WebContent/upload/test2.jpeg"));  //存擋的新路徑
		
	
		
//		OutputStream oout = response.getOutputStream(); // 輸出串流
		ImageIO.write(bimg, "jpeg", fout);    	//原本為oout也改fout
//		ImageIO.write(im  , formatName, output);
		fout.flush();							//原本為oout也改fout
		fout.close();
	}

}
