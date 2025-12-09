package DAO.DAOMODEL;

import java.util.ArrayList;
import java.util.List;

import DAO.CrudDAO;
import MODEL.NEWS;

public interface NEWSDAO extends CrudDAO<NEWS, String> {
List<NEWS> ne = new ArrayList<NEWS>();
}
