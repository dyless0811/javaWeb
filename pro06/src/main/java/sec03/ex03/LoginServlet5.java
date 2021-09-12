package sec03.ex03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet5
 */
@WebServlet(name = "login5", urlPatterns = { "/login5" })
public class LoginServlet5 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init 메서드 호출");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy 메서드 호출");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest rq, HttpServletResponse rspn) throws ServletException, IOException {
		// TODO Auto-generated method stub
		rq.setCharacterEncoding("utf-8");
		rspn.setContentType("text/html; charset=utf-8");
		PrintWriter out = rspn.getWriter();
		
		String id = rq.getParameter("user_id");
		String pw = rq.getParameter("user_pw");
		String address = rq.getParameter("user_address");
		
		System.out.println("아이디: "+id);
		System.out.println("비밀번호: "+pw);
		
		StringBuffer data = new StringBuffer();
		
		data.append("<html>");
		data.append("<body>");
		data.append("아이디: " +id);
		data.append("<br>");
		data.append("비밀번호: " +pw);
		data.append("<br>");
		data.append("주소: " +address);
		data.append("</body>");
		data.append("</html>");
		out.print(data);
	}
}
