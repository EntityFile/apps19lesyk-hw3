package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyComparator;

import java.util.Arrays;

// Sorts elements using MyComparator to compare them
public class SortDecorator extends SmartArrayDecorator{
    private MyComparator comporator;

    public SortDecorator(SmartArray smartArray, MyComparator comporator) {
        super(smartArray);
        this.comporator = comporator;
        update();
    }
    private void update() {
        array = Arrays.stream(smartArray.toArray()).sorted(comporator).toArray();
    }

    @Override
    public Object[] toArray() {
        update();
        return array.clone();
    }

    @Override
    public String operationDescription() {
        return "SortDecorator";
    }
}
