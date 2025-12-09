package SERVLET.READERS;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

import IMPLEMENT.NEWSIMPL;
import IMPLEMENT.NEWSVIEWLOGIMPL;
import MODEL.NEWS;
import MODEL.NEWSVIEWLOG;

@WebServlet("/news")
public class NEWSREADERSERVLET extends HttpServlet {

    private NEWSIMPL newsDao = new NEWSIMPL();
    private NEWSVIEWLOGIMPL logDao = new NEWSVIEWLOGIMPL();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String id = req.getParameter("id");
        String userId = (String) req.getSession().getAttribute("userId");

        // Trường hợp không có id → 404
        if (id == null || id.isBlank()) {
            req.setAttribute("pageContent", "/VIEWS/404.jsp");
        } else {

            NEWS news = newsDao.findById(id);

            if (news == null) {
                req.setAttribute("pageContent", "/VIEWS/404.jsp");
            } else {

                // 👇 Gửi bài viết sang mid
                req.setAttribute("newsDetail", news);

                // 👇 Tạo log xem bài
                if (userId != null) {
                    NEWSVIEWLOG log = new NEWSVIEWLOG();
                    log.setUSERID(userId);
                    log.setNEWSID(id);
                    log.setVIEWTIME(new Date());
                    logDao.create(log);     // Ghi log
                }

                // 👇 Set trang mid-view
                req.setAttribute("pageContent", "/VIEWS/menuviews/bai-viet.jsp");
            }
        }

        // ==========================
        // RIGHT PANEL (luôn luôn có)
        // ==========================

        req.setAttribute("top5HotNews", newsDao.getTopHot());
        req.setAttribute("top5Newsnew", newsDao.getTopNew());

        // Top bài xem nhiều theo user
        if (userId != null) {
            req.setAttribute("top5YourNews", newsDao.getTopViewsByUser(userId));
        } else {
            req.setAttribute("top5YourNews", null);
        }
        //req.getSession().setAttribute("userId", account.getId());

        // Forward layout tổng
        req.getRequestDispatcher("/VIEWS/docgia.jsp")
                .forward(req, resp);
    }
}
