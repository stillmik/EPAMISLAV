package by.neuhen.task02JavaBasic.dal;

public interface ElementDAO<T> {
    void addObject(T type);
    void deleteObject(T type);
    void deleteObject(int id);
    T getObject(int pos);
    void setElement(int pos, T type);
    int getSize();
}
