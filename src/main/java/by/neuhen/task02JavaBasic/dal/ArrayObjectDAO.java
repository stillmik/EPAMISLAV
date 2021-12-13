package by.neuhen.task02JavaBasic.dal;

import by.neuhen.task02JavaBasic.dal.storage.Array;

import java.util.ArrayList;

public class ArrayObjectDAO<T> implements ElementDAO<T> {

    private Array<T> array = new Array<>();



    @Override
    public void addObject(T type) {
        array.add(type);
    }

    @Override
    public void deleteObject(T type) {
        array.delete(type);
    }

    @Override
    public void deleteObject(int pos) {
        array.delete(pos);
    }

    @Override
    public T getObject(int pos) {
        return array.getElement(pos);
    }

    @Override
    public void setElement(int pos, T type) {
        array.setElement(pos,type);
    }

    @Override
    public int getSize() {
        return array.getSize();
    }
}
