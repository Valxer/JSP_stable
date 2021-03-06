package serv;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Article;

/**
 * Servlet implementation class EditArticle
 */
@WebServlet("/Edit")
public class EditArticle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditArticle() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int idart = Integer.parseInt(request.getParameter("select"));
		List<Article> articles = (List<Article>) request.getServletContext().getAttribute("articles");
		Article a = new Article();
		for (Article article : articles) {
			if (idart == article.getRef()) {
				a.setRef(article.getRef());
				a.setNom(article.getNom());
				a.setDescription(article.getDescription());
				a.setPrix(article.getPrix());
				a.setImage(article.getImage());
			}
		}
		request.getSession().setAttribute("editarticle", a);
		request.getRequestDispatcher("WEB-INF/editremove.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
