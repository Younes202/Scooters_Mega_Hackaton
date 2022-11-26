

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import Beans.Client;
/**
 * Servlet implementation class SErvletScoot
 */
public class SErvletScoot extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SErvletScoot() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String Fullname = request.getParameter("Fullname");
		request.setAttribute("Fullname", Fullname);
		String Username = request.getParameter("Username");
		request.setAttribute("Username", Username);
		String Email = request.getParameter("Email");
		request.setAttribute("Email", Email);
		String Phone = request.getParameter("Phone");
		request.setAttribute("Phone", Phone);
		String Password = request.getParameter("Password");
		request.setAttribute("Password", Password);
		String Address = request.getParameter("Address");
		request.setAttribute("Address", Address);
		String Gender = request.getParameter("Gender");
		request.setAttribute("Gender", Gender);
		String Type = request.getParameter("Type");
		request.setAttribute("Type", Type);
		Client cl = new Client(null,Fullname,Username,Email,Phone,Password,Address,Gender,Type);
		
		



		
		
	}

}
