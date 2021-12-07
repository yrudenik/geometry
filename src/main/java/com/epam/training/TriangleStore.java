package com.epam.training;

import com.epam.training.comparators.IdComparator;
import com.epam.training.logic.Calculator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TriangleStore implements Observer {

    private static TriangleStore instance;

    private final Map<Integer, Parameters> parameters = new HashMap<>();

    private final Calculator calculator = new Calculator();

    private TriangleStore() {
    }

    public void update(TriangleObservable triangle) {
        System.out.println("perimeter, area changed");
        double perimeter = calculator.calculatePerimeter(triangle);
        System.out.println("perimeter = " + perimeter);
        double area = calculator.calculateArea(triangle);
        System.out.println("area = " + area);
        parameters.put(triangle.getId(), new Parameters(perimeter, area));
    }

    public static TriangleStore getInstance() {
        if (instance == null) {
            instance = new TriangleStore();
        }
        return instance;
    }
}

