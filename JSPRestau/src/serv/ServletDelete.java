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

/**
 * Servlet implementation class ServletDelete
 */
@WebServlet("/Delete")
public class ServletDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ServletDelete() {
        super();
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			new ArticleDaoImpl().delete(Integer.parseInt(request.getParameter("ref")));
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
