package by.neuhen.task02JavaBasic.dal;

public class DAOFactory {
    private static final DAOFactory instance = new DAOFactory();

    private final BookDAO sqlBookImpl = new SQLBookDAO();
    private final ElementDAO arrayObjectImpl = new ArrayObjectDAO();

    public static DAOFactory getInstance(){
        return instance;
    }

    public BookDAO getBookDAO(){
        return sqlBookImpl;
    }

    public ElementDAO getElementDAO(){
        return arrayObjectImpl;
    }

}
