package com.epam.training.comparator;

import com.epam.training.TriangleIdentifiable;
import com.epam.training.logic.Calculator;

import java.util.Comparator;

public class AreaComparator implements Comparator<TriangleIdentifiable> {

    public final Calculator calculator = new Calculator();

    @Override
    public int compare(TriangleIdentifiable o1, TriangleIdentifiable o2) {
        if (calculator.calculateArea(o1) == calculator.calculateArea(o2)) {
            return 0;
        }
        if (calculator.calculateArea(o1) > calculator.calculateArea(o2)) {
            return 1;
        } else {
            return -1;
        }
    }
}
