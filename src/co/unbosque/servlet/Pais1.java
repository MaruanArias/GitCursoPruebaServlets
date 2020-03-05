package co.unbosque.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Pais1
 */
@WebServlet("/Pais1")
public class Pais1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Pais1() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		response.getWriter().println("<!DOCTYPE html>");
		response.getWriter().println("<html>");
		response.getWriter().println("<head>");
		response.getWriter().println("<meta charset=\"ISO-8859-1\">\r\n" + "<title>Insert title here</title>");
		response.getWriter().println("<body>");
		response.getWriter().println("<form  method='POST' action ='/Pi/Capital'>");
		response.getWriter().println("<label aling='center' for='pais'>Escoge el pais:</label>");
		response.getWriter().println("<select id='pais' name='SeleccionarPais'>");
		response.getWriter().println("<option value='Bogotá'>Colombia</option>");
		response.getWriter().println("<option value='Brasilia'>Brazil</option>");
		response.getWriter().println("<option value='Santiago'>Chile</option>");
		response.getWriter().println("<option value='Georgetown'>Guyana</option>");
		response.getWriter().println("<option value='Buenos Aires'>Argentina</option>");
		response.getWriter().println("<option value='Montevideo'>Uruguay</option>");
		response.getWriter().println("<option value='Caracas'>Venezuela</option>");
		response.getWriter().println("<option value='Lima'>Peru</option>");
		response.getWriter().println("<option value='Asuncion'>Paraguay</option>");
		response.getWriter().println("<option value='Quito'>Ecuador</option>");
		response.getWriter().println("<option value='Quito'>Ecuador</option>");
		response.getWriter().println("</select>");
		response.getWriter().println("<input class='btn' type='submit'>");
		response.getWriter().println("</from>");
		response.getWriter().println("</body>");
		response.getWriter().println("</html>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
