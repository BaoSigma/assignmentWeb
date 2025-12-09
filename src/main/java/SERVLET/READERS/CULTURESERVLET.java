package SERVLET.READERS;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import IMPLEMENT.NEWSIMPL;


/**
 * Servlet implementation class CULTURESERVLET
 */
@WebServlet("/CULTURESERVLET")
public class CULTURESERVLET extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CULTURESERVLET() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		NEWSIMPL dao = new NEWSIMPL();
		request.setAttribute("top5HotNews", dao.getTopHot());
		request.setAttribute("top5Newsnew", dao.getTopNew());
		request.setAttribute("top5YourNews", null);

		request.setAttribute("pageContent", "/VIEWS/category/VH.jsp");
		request.getRequestDispatcher("/VIEWS/docgia.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("pageContent", "/VIEWS/category/VH.jsp");
		request.getRequestDispatcher("/VIEWS/docgia.jsp").forward(request, response);
	}

}
