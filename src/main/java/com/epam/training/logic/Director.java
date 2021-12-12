package com.epam.training.logic;

import com.epam.training.data.DataException;
import com.epam.training.data.DataReader;
import com.epam.training.geometry.Triangle;
import com.epam.training.geometry.TriangleCreator;
import com.epam.training.geometry.TriangleValidator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;


public class Director {

    private static final Logger LOGGER = LogManager.getLogger();

    private final DataReader dataReader;
    private final TriangleValidator validator;
    private final TriangleCreator creator;

    public Director (DataReader dataReader, TriangleValidator validator, TriangleCreator creator){
        this.dataReader = dataReader;
        this.validator = validator;
        this.creator = creator;
        LOGGER.info("Director initialized and start to work");
    }

    List<Triangle> read(String filePath) throws DataException {
        LOGGER.info("Reading information from the file: " + filePath);
        List<Triangle> triangles = new ArrayList<>();
        List<String> lines = dataReader.read(filePath);
        for (String line : lines) {
            if (validator.isValid(line) && validator.isPointsFormTriangle(line)) {
                Triangle triangle = creator.create(line);
                triangles.add(triangle);
                }
            LOGGER.info("Director finished the task");
            }
        return triangles;
    }
}
