package com.epam.training.repository;

import com.epam.training.TriangleIdentifiable;
import com.epam.training.logic.Calculator;

public class PerimeterSpecification implements Specification {

    private final double minPerimeter;
    private final double maxPerimeter;

    public PerimeterSpecification(double minPerimeter, double maxPerimeter) {
        this.minPerimeter = minPerimeter;
        this.maxPerimeter = maxPerimeter;
    }

    private final Calculator calculator = new Calculator();

    @Override
    public boolean specified(TriangleIdentifiable triangle) {
        if (calculator.calculatePerimeter(triangle) > minPerimeter && calculator.calculatePerimeter(triangle) < maxPerimeter) {
            return true;
        } else {
            return false;
        }
    }
}
