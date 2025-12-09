package SERVLET.READERS;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import IMPLEMENT.NEWSIMPL;



@WebServlet("/docgia")
public class HOMESERVLET extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // CHỈ LOAD TRANG TRUNG TÂM MẶC ĐỊNH
    	NEWSIMPL dao = new NEWSIMPL();
    	request.setAttribute("top5HotNews", dao.getTopHot());
    	request.setAttribute("top5Newsnew", dao.getTopNew());
    	request.setAttribute("top5YourNews", null);

        request.setAttribute("pageContent", "/VIEWS/category/TC.jsp");

        request.getRequestDispatcher("/VIEWS/docgia.jsp")
               .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setAttribute("pageContent", "/VIEWS/category/TC.jsp");

        request.getRequestDispatcher("/VIEWS/docgia.jsp")
               .forward(request, response);
    }
}
