package sec01.ex01;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class LoginServlet2
 */
@WebServlet(name = "login2", urlPatterns = { "/login2" })
public class LoginServlet2 extends HttpServlet implements Servlet {
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init() throws ServletException {
		System.out.println("init 메서드 호출");
	}

	protected void doGet(HttpServletRequest rq, HttpServletResponse rspn) throws ServletException, IOException {
		System.out.println("doGet 호출");
		rq.setCharacterEncoding("utf-8");
		rspn.setContentType("text/html;charset=utf-8");
		PrintWriter out = rspn.getWriter();
		String id = rq.getParameter("user_id");
		String pw = rq.getParameter("user_pw");
		
		StringBuffer data = new StringBuffer();
		
		data.append("<html>");
		data.append("<body>");
		data.append("아이디 : " + id);
		data.append("<br>");
		data.append("패스워드 : " + pw);
		data.append("</body>");
		data.append("</html>");
		out.print(data);
	}
	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("destroy 메서드 호출");
	}


}
