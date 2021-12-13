package by.neuhen.task02JavaBasic.dal.storage;

public interface ArrayFunctionsForUser<T> {

    void add(T type);
    void delete(T type);
    void delete(int pos);
    T getElement(int pos);
    void setElement(int pos, T type);
    int getSize();
}
