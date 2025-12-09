package IMPLEMENT;

import java.util.List;

import DAO.DAOMODEL.NEWSDAO;
import MODEL.NEWS;
import Util.UQuery;

public class NEWSIMPL implements NEWSDAO {

    private static final String SQL_TOP5_HOT =
            "SELECT TOP 5 * FROM News ORDER BY ViewCount DESC";

    private static final String SQL_TOP5_NEW =
            "SELECT TOP 5 * FROM News ORDER BY PostedDate DESC";

    private static final String SQL_TOP5_VIEWS_BY_USER =
    	    "SELECT TOP 5 n.* FROM NewsViewLog l " +
    	    "JOIN News n ON l.NewsId = n.Id " +
    	    "WHERE l.UserId = ? " +
    	    "GROUP BY n.Id, n.Title, n.Content, n.Image, n.PostedDate, " +
    	    "n.Author, n.ViewCount, n.CategoryId, n.Home " +
    	    "ORDER BY COUNT(*) DESC";



    private static final String SQL_FIND_ID =
            "SELECT * FROM News WHERE Id = ?";

    private static final String SQL_FIND_ALL =
            "SELECT * FROM News";

    @Override
    public NEWS create(NEWS entity) {
        // Tự bạn viết INSERT
        return null;
    }

    @Override
    public void update(NEWS entity) {}

    @Override
    public void deleteById(String id) {}

    @Override
    public List<NEWS> findAll() {
        return UQuery.getBeanList(NEWS.class, SQL_FIND_ALL);
    }

    @Override
    public NEWS findById(String id) {
        return UQuery.getSingleBean(NEWS.class, SQL_FIND_ID, id);
    }

    // ============================
    //      TOP 5 FUNCTIONS
    // ============================

    public List<NEWS> getTopHot() {
        return UQuery.getBeanList(NEWS.class, SQL_TOP5_HOT);
    }

    public List<NEWS> getTopNew() {
        return UQuery.getBeanList(NEWS.class, SQL_TOP5_NEW);
    }

    public List<NEWS> getTopViewsByUser(String userId) {
        return UQuery.getBeanList(NEWS.class, SQL_TOP5_VIEWS_BY_USER, userId);
    }

}
