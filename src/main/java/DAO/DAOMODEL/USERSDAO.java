package DAO.DAOMODEL;

import java.util.ArrayList;
import java.util.List;

import DAO.CrudDAO;
import MODEL.USERS;

public interface USERSDAO extends CrudDAO<USERS, String> {
List<USERS> us = new ArrayList<USERS>();
}
