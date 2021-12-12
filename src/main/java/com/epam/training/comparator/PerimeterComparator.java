package com.epam.training.comparator;

import com.epam.training.TriangleIdentifiable;
import com.epam.training.logic.Calculator;

import java.util.Comparator;

public class PerimeterComparator implements Comparator<TriangleIdentifiable> {

    private final Calculator calculator = new Calculator();

    @Override
    public int compare(TriangleIdentifiable o1, TriangleIdentifiable o2) {
        if (calculator.calculatePerimeter(o1) == calculator.calculatePerimeter(o2)) {
            return 0;
        }
        if (calculator.calculatePerimeter(o1) > calculator.calculatePerimeter(o2)) {
            return 1;
        } else {
            return -1;
        }
    }
}
