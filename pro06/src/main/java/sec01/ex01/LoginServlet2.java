package sec01.ex01;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

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
