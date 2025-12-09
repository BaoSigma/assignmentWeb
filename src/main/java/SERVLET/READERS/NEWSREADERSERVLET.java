package SERVLET.READERS;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import IMPLEMENT.NEWSIMPL;
import MODEL.NEWS;

@WebServlet("/NEWSREADERSERVLET")
public class NEWSREADERSERVLET extends HttpServlet {

    private NEWSIMPL dao = new NEWSIMPL();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String action = req.getParameter("action");

        if (action == null) {
            resp.sendRedirect(req.getContextPath() + "/home");
            return;
        }

        switch (action) {
            case "view":
                viewNews(req, resp);
                break;

            default:
                resp.sendRedirect(req.getContextPath() + "/home");
                break;
        }
    }

    private void viewNews(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String idRaw = req.getParameter("id");

        // kiểm tra id null hoặc lỗi format
        if (idRaw == null) {
            req.setAttribute("pageContent", "/VIEWS/404.jsp");
            req.getRequestDispatcher("/VIEWS/docgia.jsp").forward(req, resp);
            return;
        }

        int id;
        try {
            id = Integer.parseInt(idRaw);
        } catch (NumberFormatException e) {
            req.setAttribute("pageContent", "/VIEWS/404.jsp");
            req.getRequestDispatcher("/VIEWS/docgia.jsp").forward(req, resp);
            return;
        }

        // Lấy dữ liệu
        NEWS news = dao.findById(String.valueOf(id));

        if (news == null) {
            req.setAttribute("pageContent", "/VIEWS/404.jsp");
        } else {
            req.setAttribute("newsDetail", news);
            req.setAttribute("pageContent", "/VIEWS/menuviews/mid.jsp");
        }

        req.getRequestDispatcher("/VIEWS/docgia.jsp").forward(req, resp);
    }
}
