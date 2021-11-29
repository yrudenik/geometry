package com.epam.training.geometry;

public class TriangleValidator {

    public static final String TRIANGLE_CREATE_FORMAT = "^\\s*((-)?\\d+\\.\\d+\\s+){5}(-)?\\d+\\.\\d+\\s*$";

    public boolean isValid (String line){
        return line.matches(TRIANGLE_CREATE_FORMAT);
    }
}
