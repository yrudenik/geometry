package com.epam.training.repository;

import com.epam.training.TriangleObservable;
import com.epam.training.logic.Calculator;

public class PerimeterSpecification implements Specification {

    private static final double MIN_PERIMETER = 5.0;
    private static final double MAX_PERIMETER = 20.0;

    private final Calculator calculator = new Calculator();

    @Override
    public boolean specified(TriangleObservable triangle) {
        if (calculator.calculatePerimeter(triangle) > MIN_PERIMETER && calculator.calculatePerimeter(triangle) < MAX_PERIMETER) {
            return true;
        } else {
            return false;
        }
    }
}
