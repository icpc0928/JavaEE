package tw.leo.tags;

import java.io.IOException;
import java.io.StringWriter;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class MyTag2  extends SimpleTagSupport{
	@Override
	public void doTag() throws JspException, IOException {
		// TODO Auto-generated method stub
		super.doTag();
		
		JspContext context = getJspContext();
		JspWriter out = context.getOut();
		JspFragment body = getJspBody();
		
		
		StringWriter swriter= new StringWriter();
		body.invoke(swriter);
		
		System.out.println(swriter.toString());
		
		out.println("Hello i am writing in body " + swriter.toString().toUpperCase());
		
		
	}

}
