package sec03.ex01;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

/**
 * Servlet implementation class LoginServlet3
 */
@WebServlet(name = "login3", urlPatterns = { "/login3" })
public class LoginServlet3 extends HttpServlet implements Servlet {
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init 메서드 호출");
	}
	
	protected void doPost(HttpServletRequest rq, HttpServletResponse rspn) throws ServletException, IOException {
		rq.setCharacterEncoding("utf-8");
		String user_id = rq.getParameter("user_id");
		String user_pw = rq.getParameter("user_pw");
		System.out.println("아이디: "+user_id);
		System.out.println("비밀번호: "+user_pw);
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
