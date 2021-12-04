package com.epam.training.geometry;

public class TriangleCreator {

    private static final String DELIMITER=" ";

    public Triangle create(String line){
        String[] numbers = line.split(DELIMITER);
        double firstArg = Double.parseDouble(numbers[0]);
        double secondArg = Double.parseDouble(numbers[1]);
        double thirdArg = Double.parseDouble(numbers[2]);
        double fourthArg = Double.parseDouble(numbers[3]);
        double fifthArg = Double.parseDouble(numbers[4]);
        double sixthArg = Double.parseDouble(numbers[5]);
        return new Triangle(new Point(firstArg, secondArg), new Point(thirdArg, fourthArg), new Point(fifthArg, sixthArg));
    }
}
