package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyFunction;

import java.util.Arrays;

// Map every element to another object using MyFunction
public class MapDecorator extends SmartArrayDecorator{
    private MyFunction func;

    public MapDecorator(SmartArray smartArray, MyFunction func) {
        super(smartArray);
        this.func = func;
        update();
    }

    private void update() {
        array = Arrays.stream(smartArray.toArray()).map(func::apply).toArray();
    }

    @Override
    public Object[] toArray() {
        update();
        return array.clone();
    }

    @Override
    public String operationDescription() {
        return "MapDecorator";
    }
}
