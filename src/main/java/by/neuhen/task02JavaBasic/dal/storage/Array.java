package by.neuhen.task02JavaBasic.dal.storage;

public class Array<T> implements ArrayFunctionsForUser<T> {

    private final int INIT_SIZE = 8;
    private final int MULTIPLIER = 2;
    private final int CUT_RATE = 4;
    private int pointer = 0;
    private Object[] array = new Object[INIT_SIZE];

    @Override
    public void add(T type) {
        if (pointer >= array.length - 1) {
            resize(array.length * MULTIPLIER);
        }
        array[pointer++] = type;
    }

    @Override
    public void delete(T type) {
        int pos=-1;
        for(int i=0;i<pointer;i++){
            if (type.equals(array[i])) {
                pos = i;
                break;
            }
        }
        if(pos!=-1)
            delete(pos);
    }

    @Override
    public void delete(int pos) {
        if(sizeIsLesserThanPos(pos))
            return;
        if (pointer - pos >= 0)
            System.arraycopy(array, pos + 1, array, pos, pointer - pos);
        array[pointer] = null;
        pointer--;
        if (array.length > INIT_SIZE && pointer < array.length / CUT_RATE)
            resize(array.length / 2);
    }

    private boolean sizeIsLesserThanPos(int pos){
        return pos > pointer;
    }

    @Override
    public T getElement(int pos) {
        if(sizeIsLesserThanPos(pos))
            return null;
        return (T) array[pos];
    }

    @Override
    public void setElement(int pos,T type) {
        if(sizeIsLesserThanPos(pos))
            return;
        array[pos] = type;
    }


    private void resize(int length) {
        Object[] newArray = new Object[length];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }

    @Override
    public int getSize() {
        return pointer;
    }
}
