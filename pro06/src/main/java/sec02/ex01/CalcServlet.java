package sec02.ex01;

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
 * Servlet implementation class CalcServlet
 */
@WebServlet(name = "calc", urlPatterns = { "/calc" })
public class CalcServlet extends HttpServlet implements Servlet {
       
	private static float USD_RATE = 1170.38F;
	private static float JPY_RATE = 10.65F;
	private static float CNY_RATE = 181.61F;
	private static float GBP_RATE = 1619.22F;
	private static float EUR_RATE = 1382.77F;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalcServlet() {
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
	
	protected void doGet(HttpServletRequest rq, HttpServletResponse rspn) throws ServletException, IOException {
		System.out.println("doGet 메서드 호출");
		rq.setCharacterEncoding("utf-8");
		rspn.setContentType("text/html; charset=utf-8");
		PrintWriter pw = rspn.getWriter();
		
		String command = rq.getParameter("command");
		String won = rq.getParameter("won");
		String operator = rq.getParameter("operator");
		
		if (command != null && command.equals("calculate")) {
			String result = calculate(Float.parseFloat(won), operator);
			pw.print("<html><font size=10>변환 결과</font><br>");
			pw.print("<html><font size=10>"+result+"</font><br>");
			pw.print("<a href='/pro06/calc'>환율 계산기</a>");
			return;
		}
		
		pw.print("<html><title>환율 계산기</title>");
		pw.print("<font size=5>환율 계산기</font><br>");
		pw.print("<form name='frmCalc' method='get' action='/pro06/calc'/>");
		pw.print("원화: <input type='text' name='won' size=10/>");
		pw.print("<select name='operator'>");
		pw.print("<option value='dollar'>달러</option>");
		pw.print("<option value='en'>엔화</option>");
		pw.print("<option value='wian'>위안</option>");
		pw.print("<option value='pound'>파운드</option>");
		pw.print("<option value='euro'>유로</option>");
		pw.print("</select>");
		pw.print("<input type='hidden' name='command' value='calculate'/>");
		pw.println("<input type='submit' value='변환'/>");
		pw.println("</form>");
		pw.print("</html>");
		pw.close();
	}
	
	private static String calculate(float won, String operator) {
		String result = null;
		switch(operator) {
		case "dollar":
			result = String.format("%.6f", won / USD_RATE);
			break;
		case "en":
			result = String.format("%.6f", won / JPY_RATE);
			break;
		case "wian":
			result = String.format("%.6f", won / CNY_RATE);
			break;
		case "pound":
			result = String.format("%.6f", won / GBP_RATE);
			break;
		case "euro":
			result = String.format("%.6f", won / EUR_RATE);
			break;
		}
		return result;
	}
	
	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
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

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
//	public void service(ServletRequest rq, ServletResponse rspn) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//
//	}

}
