package ua.edu.ucu.smartarr;

// Base array for decorators
public class BaseArray implements SmartArray {
    private Object[] array;
    private int size;

    public BaseArray(Object[] arr) {
        array = new Object[arr.length];
        int i = 0;

        for (Object elem : arr) {
            array[i] = elem;
            i++;
        }

        size = i;
    }

    @Override
    public Object[] toArray() {
        Object[] newArray = new Object[size];
        System.arraycopy(array, 0, newArray, 0, size);

        return newArray;
    }

    @Override
    public String operationDescription() {
        return "BaseArray";
    }

    public void setValue(int ind) {
        array[ind] = 0;
    }

    @Override
    public int size() {
        return size;
    }
}
