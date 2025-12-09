package DAO.DAOMODEL;

import java.util.ArrayList;
import java.util.List;

import DAO.CrudDAO;
import MODEL.NEWSLETTERS;
import MODEL.NEWSVIEWLOG;

public interface NEWSVIEWLOGDAO extends CrudDAO<NEWSVIEWLOG, Object>{
	List<NEWSVIEWLOG>newsletter = new ArrayList<NEWSVIEWLOG>();
}
