package serv;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoAdminImpl;
import dao.DaoClientImpl;
import model.Admin;

/**
 * Servlet implementation class ServletConnexionAdmin
 */
@WebServlet("/ServletConnexionAdmin")
public class ServletConnexionAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletConnexionAdmin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int identifiant = 0;
		String mdp = null;
		if (request.getSession().getAttribute("admin") == null){
			identifiant = Integer.parseInt(request.getParameter("identifiant"));
			mdp = request.getParameter("mdp");
		
			try {
				Admin a = new DaoAdminImpl().findById(identifiant);
				if (a == null || !a.isActif() || !mdp.equals(a.getMotDePasse())){
					request.getRequestDispatcher("WEB-INF/ErreurConnexion.jsp").forward(request, response);
				} else {
					request.getSession().setAttribute("admin", a);
					request.getRequestDispatcher("WEB-INF/adminArticle.jsp").forward(request, response);
				}
			} catch (ClassNotFoundException | SQLException e) {
				request.getRequestDispatcher("WEB-INF/ErreurConnexion.jsp").forward(request, response);
				e.printStackTrace();
			}
		}
		else
			request.getRequestDispatcher("WEB-INF/adminArticle.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
