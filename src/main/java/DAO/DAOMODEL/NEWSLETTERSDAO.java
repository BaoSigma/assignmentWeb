package DAO.DAOMODEL;

import java.util.ArrayList;
import java.util.List;

import DAO.CrudDAO;
import MODEL.NEWSLETTERS;

public interface NEWSLETTERSDAO extends CrudDAO<NEWSLETTERS, String> {
List<NEWSLETTERS>newsletter = new ArrayList<NEWSLETTERS>();
}
