package com.epam.training.geometry;

public class TriangleValidator {

    public static final String TRIANGLE_CREATE_FORMAT = "^\\s*((-)?\\d+\\.\\d+\\s+){5}(-)?\\d+\\.\\d+\\s*$";
    private static final String DELIMITER=" ";

    public boolean isValid (String line){
        return line.matches(TRIANGLE_CREATE_FORMAT);
    }

/*    public boolean isPointsFormTriangle(Triangle triangle) {
        double xOne = triangle.getFirstPoint().getxCoord();
        double yOne = triangle.getFirstPoint().getyCoord();
        double xTwo = triangle.getSecondPoint().getxCoord();
        double yTwo = triangle.getSecondPoint().getyCoord();
        double xThree = triangle.getThirdPoint().getxCoord();
        double yThree = triangle.getThirdPoint().getyCoord();
        if ( (xThree-xOne)*(yTwo-yOne)-(yThree-yOne)*(xTwo-xOne) == 0 ){
            return false;
        }
        return true;
    }*/

    public boolean isPointsFormTriangle(String line) {
        String[] numbers = line.split(DELIMITER);
        double xOne = Double.parseDouble(numbers[0]);
        double yOne = Double.parseDouble(numbers[1]);
        double xTwo = Double.parseDouble(numbers[2]);
        double yTwo = Double.parseDouble(numbers[3]);
        double xThree = Double.parseDouble(numbers[4]);
        double yThree = Double.parseDouble(numbers[5]);
        if ( (xThree-xOne)*(yTwo-yOne)-(yThree-yOne)*(xTwo-xOne) == 0 ){
            return false;
        }
        return true;
    }
}
