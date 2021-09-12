package sec01.ex01;

import jakarta.servlet.ServletException;

import java.io.IOException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

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
