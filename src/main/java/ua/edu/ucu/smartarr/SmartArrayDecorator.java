package ua.edu.ucu.smartarr;

abstract class SmartArrayDecorator implements SmartArray {

    protected SmartArray smartArray;
    protected Object[] array;

    public SmartArrayDecorator(SmartArray smartArray) {
        this.smartArray = smartArray;
    }

    @Override
    public Object[] toArray() {
        Object[] newArray = new Object[array.length];
        System.arraycopy(array, 0, newArray, 0, array.length);

        return newArray;
    }

    @Override
    public String operationDescription() {
        return "NoDecorators";
    }

    @Override
    public int size() {
        return array.length;
    }
}
