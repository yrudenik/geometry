package com.epam.training;

import com.epam.training.logic.Calculator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

public class TriangleStore implements Observer {

    private static final Logger LOGGER = LogManager.getLogger();

    private static TriangleStore instance;

    private final Map<Integer, Parameters> parameters = new HashMap<>();

    private final Calculator calculator = new Calculator();

    private TriangleStore() {
    }

    public void update(TriangleIdentifiable triangle) {
        LOGGER.info("Triangle has been changed");
        double perimeter = calculator.calculatePerimeter(triangle);
        double area = calculator.calculateArea(triangle);
        parameters.put(triangle.getId(), new Parameters(perimeter, area));
    }

    public static TriangleStore getInstance() {
        if (instance == null) {
            instance = new TriangleStore();
        }
        return instance;
    }

    public Map<Integer, Parameters> getParameters() {
        return parameters;
    }
}

