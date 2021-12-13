package by.neuhen.task02JavaBasic.service;

import by.neuhen.task02JavaBasic.dal.DAOFactory;
import by.neuhen.task02JavaBasic.dal.ElementDAO;

public class ArrayServiceImpl<T> implements ArrayService<T> {

    @Override
    public void addObject(T type) {
        DAOFactory daoFactory = DAOFactory.getInstance();
        ElementDAO<T> elementDAO = daoFactory.getElementDAO();
        elementDAO.addObject(type);
    }

    @Override
    public void deleteObject(T type) {
        DAOFactory daoFactory = DAOFactory.getInstance();
        ElementDAO<T> elementDAO = daoFactory.getElementDAO();
        elementDAO.deleteObject(type);
    }

    @Override
    public void deleteObject(int id) {
        DAOFactory daoFactory = DAOFactory.getInstance();
        ElementDAO<T> elementDAO = daoFactory.getElementDAO();
        elementDAO.deleteObject(id);
    }

    @Override
    public T getObject(int pos) {
        DAOFactory daoFactory = DAOFactory.getInstance();
        ElementDAO<T> elementDAO = daoFactory.getElementDAO();
        return elementDAO.getObject(pos);
    }

    @Override
    public void setElement(int pos, T type) {
        DAOFactory daoFactory = DAOFactory.getInstance();
        ElementDAO<T> elementDAO = daoFactory.getElementDAO();
        elementDAO.setElement(pos,type);
    }

    @Override
    public int getSize() {
        DAOFactory daoFactory = DAOFactory.getInstance();
        ElementDAO<T> elementDAO = daoFactory.getElementDAO();
        return elementDAO.getSize();
    }
}
