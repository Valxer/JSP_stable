package serv;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ArticleDaoImpl;
import model.Article;

/**
 * Servlet implementation class CreateArticle
 */
@WebServlet("/Create")
public class CreateArticle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateArticle() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int ref = Integer.parseInt(request.getParameter("ref"));
		String nom = request.getParameter("nom");
		String description = request.getParameter("description");
		int prix = Integer.parseInt(request.getParameter("prix"));
		String image = request.getParameter("image");
		List<Article> articles = (List<Article>) request.getServletContext().getAttribute("articles");
		Article newa = new Article(ref, nom, description, prix, image); 
		try {
			new ArticleDaoImpl().create(newa);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
			request.getRequestDispatcher("WEB-INF/ErreurCreation.jsp").forward(request, response);
		}
		articles.add(newa);
		request.getServletContext().setAttribute("articles", articles);
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
