package IMPLEMENT;

import java.util.List;

import DAO.DAOMODEL.NEWSVIEWLOGDAO;
import MODEL.NEWSVIEWLOG;
import MODEL.NEWS;
import Util.UJDBC;
import Util.UQuery;

public class NEWSVIEWLOGIMPL implements NEWSVIEWLOGDAO {

    private static final String SQL_INSERT =
        "INSERT INTO NewsViewLog (UserId, NewsId, ViewTime) VALUES (?, ?, ?)";

    // LẤY TẤT CẢ LOG
    private static final String SQL_FIND_ALL =
        "SELECT * FROM NewsViewLog";

    // LẤY LOG THEO USER
    private static final String SQL_FIND_BY_USER =
        "SELECT * FROM NewsViewLog WHERE UserId = ? ORDER BY ViewTime DESC";

    // LẤY TOP 5 BÀI USER XEM NHIỀU NHẤT
    private static final String SQL_TOP5_BY_USER =
        "SELECT TOP 5 n.* FROM NewsViewLog l " +
        "JOIN News n ON l.NewsId = n.Id " +
        "WHERE l.UserId = ? " +
        "GROUP BY n.Id, n.Title, n.Content, n.Image, n.PostedDate, " +
        "n.Author, n.ViewCount, n.CategoryId, n.Home " +
        "ORDER BY COUNT(*) DESC";


    @Override
    public NEWSVIEWLOG create(NEWSVIEWLOG entity) {
        Object[] values = {
            entity.getUSERID(),
            entity.getNEWSID(),
            entity.getVIEWTIME()
        };
        UJDBC.executeUpdate(SQL_INSERT, values);
        return entity;
    }

    @Override
    public void update(NEWSVIEWLOG entity) {}

    @Override
    public void deleteById(Object id) {}

    @Override
    public List<NEWSVIEWLOG> findAll() {
        return UQuery.getBeanList(NEWSVIEWLOG.class, SQL_FIND_ALL);
    }

    @Override
    public NEWSVIEWLOG findById(Object id) {
        return null;
    }

    public List<NEWSVIEWLOG> findByUser(String userId) {
        return UQuery.getBeanList(NEWSVIEWLOG.class, SQL_FIND_BY_USER, userId);
    }

    // ⭐⭐ LẤY TOP 5 BÀI USER XEM NHIỀU NHẤT ⭐⭐
    public List<NEWS> getTopViewByUser(String userId) {
        return UQuery.getBeanList(NEWS.class, SQL_TOP5_BY_USER, userId);
    }
}
