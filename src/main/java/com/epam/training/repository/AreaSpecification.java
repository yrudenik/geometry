package com.epam.training.repository;

import com.epam.training.TriangleObservable;
import com.epam.training.logic.Calculator;

public class AreaSpecification implements Specification {

    private static final double MIN_AREA = 4.0;
    private static final double MAX_AREA = 30.0;

    private final Calculator calculator = new Calculator();

    @Override
    public boolean specified(TriangleObservable triangle) {
        if (calculator.calculateArea(triangle) > MIN_AREA && calculator.calculateArea(triangle) < MAX_AREA) {
            return true;
        } else {
            return false;
        }
    }
}
