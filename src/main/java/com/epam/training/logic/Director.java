package com.epam.training.logic;

import com.epam.training.data.DataException;
import com.epam.training.data.DataReader;
import com.epam.training.geometry.Triangle;
import com.epam.training.geometry.TriangleCreator;
import com.epam.training.geometry.TriangleValidator;

import java.util.ArrayList;
import java.util.List;

public class Director {

    private final DataReader dataReader;
    private final TriangleValidator validator;
    private final TriangleCreator creator;

    public Director (DataReader dataReader, TriangleValidator validator, TriangleCreator creator){
        this.dataReader = dataReader;
        this.validator = validator;
        this.creator = creator;
    }

    List<Triangle> read(String filePath) throws DataException {
        List<Triangle> triangles = new ArrayList<>();
        List<String> lines = dataReader.read(filePath);
        for (String line : lines) {
            if (validator.isValid(line) && validator.isPointsFormTriangle(line)) {
                Triangle triangle = creator.create(line);
                triangles.add(triangle);
                }
            }
        return triangles;
    }
}
