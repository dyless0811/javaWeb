package sec01.ex01;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Enumeration;

import org.omg.CORBA.Request;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

/**
 * Servlet implementation class InputServlet2
 */
@WebServlet(name = "input2", urlPatterns = { "/input2" })
public class InputServlet2 extends HttpServlet implements Servlet {
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InputServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init 메서드 호출");
	}

	protected void doGet(HttpServletRequest rq, HttpServletResponse rspn) throws ServletException, IOException {
		rq.setCharacterEncoding("utf-8");
		Enumeration<String> enu = rq.getParameterNames();
		while(enu.hasMoreElements()) {
			String name = (String) enu.nextElement();
			String[] values = rq.getParameterValues(name);
			for (String value : values) {
				System.out.println("name= "+name+", value= "+value);
			}
		}
	}
	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy 메서드 호출");
	}

	/**
	 * @see Servlet#getServletConfig()
	 */
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see Servlet#getServletInfo()
	 */
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null; 
	}

}
