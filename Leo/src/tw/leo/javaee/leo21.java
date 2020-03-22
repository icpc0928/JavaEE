package tw.leo.javaee;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/leo21")
public class leo21 extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("image/jpeg"); //這句很重要
		
		String srate = request.getParameter("rate");
		if(srate == null) return;
		float rate = 0;
		try {
			rate = Float.parseFloat(srate);
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
		
		BufferedImage bimg = new BufferedImage(400, 20, BufferedImage.TYPE_INT_RGB);
		Graphics2D g2d = bimg.createGraphics();
		
		g2d.setColor(Color.YELLOW);
		//g2d.fillRoundRect(0, 0, 400, 20, 20, 10);
		g2d.fillRect(0, 0, bimg.getWidth(), bimg.getHeight());	//從0,0 到400,20  填滿的意思
		g2d.setColor(Color.red);
		g2d.fillRect(0, 0, (int)(bimg.getWidth()/100*rate), bimg.getHeight());
		
		
		OutputStream oout = response.getOutputStream();	//輸出串流
		
		ImageIO.write(bimg, "jpeg"     , oout  );
//		ImageIO.write(im  , formatName, output);
		oout.flush();
		oout.close();
		
		
		
		
		
		
		
	}

}
