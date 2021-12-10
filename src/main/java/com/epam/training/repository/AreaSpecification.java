package com.epam.training.repository;

import com.epam.training.TriangleIdentifiable;
import com.epam.training.logic.Calculator;

public class AreaSpecification implements Specification {

    private final double minArea;
    private final double maxArea;

    public AreaSpecification(double minArea, double maxArea) {
        this.minArea = minArea;
        this.maxArea = maxArea;
    }

    private final Calculator calculator = new Calculator();

    @Override
    public boolean specified(TriangleIdentifiable triangle) {
        if (calculator.calculateArea(triangle) > minArea && calculator.calculateArea(triangle) < maxArea) {
            return true;
        } else {
            return false;
        }
    }
}
