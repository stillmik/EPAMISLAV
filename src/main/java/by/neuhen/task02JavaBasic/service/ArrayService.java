package by.neuhen.task02JavaBasic.service;

public interface ArrayService<T> {
    void addObject(T type);
    void deleteObject(T type);
    void deleteObject(int id);
    T getObject(int pos);
    void setElement(int pos, T type);
    int getSize();
}
