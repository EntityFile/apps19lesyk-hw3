package ua.edu.ucu.smartarr;

import java.util.Arrays;
import java.util.LinkedHashSet;

// Remove duplicates from SmartArray. Use method equals() to compare objects
public class DistinctDecorator extends SmartArrayDecorator{

    public DistinctDecorator(SmartArray smartArray) {
        super(smartArray);
        update();
    }

    private void update() {
        LinkedHashSet<Object> settedArray = new LinkedHashSet<>(Arrays.asList(smartArray.toArray()));
        array = settedArray.toArray();
    }
    @Override
    public Object[] toArray() {
        update();
        return array.clone();
    }

    @Override
    public String operationDescription() {
        return "DistinctDecorator";
    }
}
