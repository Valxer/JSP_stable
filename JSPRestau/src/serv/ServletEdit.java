package serv;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ArticleDaoImpl;
import model.Article;

@WebServlet("/Editarticle")
public class ServletEdit extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ServletEdit() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Article a = new Article();
		a.setRef(Integer.parseInt(request.getParameter("ref")));
		a.setNom(request.getParameter("nom"));
		a.setDescription(request.getParameter("desc"));
		a.setPrix(Integer.parseInt(request.getParameter("prix")));
		a.setImage(request.getParameter("img"));
		try {
			new ArticleDaoImpl().update(a);
			request.getServletContext().setAttribute("articles", new ArticleDaoImpl().findAll());
			request.getRequestDispatcher("WEB-INF/editconfirm.jsp").forward(request, response);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			request.getRequestDispatcher("WEB-INF/editfail.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
