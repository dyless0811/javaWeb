package sec01.ex01;

import javax.servlet.ServletException;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ThirdServlet
 */
@WebServlet("/third")
public class ThirdServlet extends HttpServlet implements Servlet {

	/**
     * @see Servlet#init(ServletConfig)
     */
    public void init(ServletConfig arg0) throws ServletException { 
         // TODO Auto-generated method stub
    	System.out.println("ThirdServlet init 호출");
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException{
    	System.out.println("ThirdServlet doGet 호출");
    }
    
	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("ThirdServlet destroy 호출");
	}


}
