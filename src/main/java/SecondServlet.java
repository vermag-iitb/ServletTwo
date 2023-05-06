import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
//import javax.servlet.annotation.WebServlet;

//@WebServlet("/second")

public class SecondServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    public SecondServlet() 
    {
        super();
    }

	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException 
	{
		try
        {
            PrintWriter pw = response.getWriter();
            pw.println("<html><body bgcolor=green text=yellow><h1>");
            pw.println("Welcome to Second Servlet response");
            pw.println("</h1></body></html>");
        }
        catch(Exception e)
        {
            System.err.println(e);
        }
	}
}
