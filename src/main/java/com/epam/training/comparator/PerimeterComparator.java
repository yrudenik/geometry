package com.epam.training.comparator;

import com.epam.training.TriangleObservable;
import com.epam.training.logic.Calculator;

import java.util.Comparator;

public class PerimeterComparator implements Comparator<TriangleObservable> {

    private final Calculator calculator = new Calculator();

    @Override
    public int compare(TriangleObservable o1, TriangleObservable o2) {
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
