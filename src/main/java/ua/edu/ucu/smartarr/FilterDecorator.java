package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyPredicate;

import java.util.Arrays;

// Tests every element and removes it if it doesn't satisfy MyPredicate
public class FilterDecorator extends SmartArrayDecorator{
    private MyPredicate predicate;

    public FilterDecorator(SmartArray smartArray, MyPredicate predicate) {
        super(smartArray);
        this.predicate = predicate;
        update();
    }

    private void update() {
        array = Arrays.stream(smartArray.toArray()).filter(predicate::test).toArray();
    }

    @Override
    public Object[] toArray() {
        update();
        return array.clone();
    }

    @Override
    public String operationDescription() {
        return "FilterDecorator";
    }
}
