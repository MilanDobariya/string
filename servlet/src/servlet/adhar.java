package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ResponseCache;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class adhar
 */
@WebServlet("/adhar")
public class adhar extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession hs=request.getSession();
		String str=request.getParameter("table");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("hello:"+str);
		hs.setAttribute("table", str);
		response.sendRedirect("adhar2");
	}

}
