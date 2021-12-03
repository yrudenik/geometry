package com.epam.training.logic;

import com.epam.training.geometry.Triangle;

public class Calculator {

    public double calculatePerimeter(Triangle triangle) {
        double xOne = triangle.getFirstPoint().getxCoord();
        double yOne = triangle.getFirstPoint().getyCoord();
        double xTwo = triangle.getSecondPoint().getxCoord();
        double yTwo = triangle.getSecondPoint().getyCoord();
        double xThree = triangle.getThirdPoint().getxCoord();
        double yThree = triangle.getThirdPoint().getyCoord();
        double legOne = Math.sqrt((xTwo-xOne)*(xTwo-xOne)+(yTwo-yOne)*(yTwo-yOne));
        double legTwo = Math.sqrt((xThree-xTwo)*(xThree-xTwo)+(yThree-yTwo)*(yThree-yTwo));
        double legThree = Math.sqrt((xOne-xThree)*(xOne-xThree)+(yOne-yThree)*(yOne-yThree));
        return legOne + legTwo + legThree;
    }

    public double calculateArea(Triangle triangle) {
        double xOne = triangle.getFirstPoint().getxCoord();
        double yOne = triangle.getFirstPoint().getyCoord();
        double xTwo = triangle.getSecondPoint().getxCoord();
        double yTwo = triangle.getSecondPoint().getyCoord();
        double xThree = triangle.getThirdPoint().getxCoord();
        double yThree = triangle.getThirdPoint().getyCoord();
        double legOne = Math.sqrt((xTwo-xOne)*(xTwo-xOne)+(yTwo-yOne)*(yTwo-yOne));
        double legTwo = Math.sqrt((xThree-xTwo)*(xThree-xTwo)+(yThree-yTwo)*(yThree-yTwo));
        double legThree = Math.sqrt((xOne-xThree)*(xOne-xThree)+(yOne-yThree)*(yOne-yThree));
        double halfPerimeter = (legOne + legTwo + legThree) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - legOne) * (halfPerimeter - legTwo) * (halfPerimeter - legThree));
    }

    public String checkAngleType(Triangle triangle) {
        double xOne = triangle.getFirstPoint().getxCoord();
        double yOne = triangle.getFirstPoint().getyCoord();
        double xTwo = triangle.getSecondPoint().getxCoord();
        double yTwo = triangle.getSecondPoint().getyCoord();
        double xThree = triangle.getThirdPoint().getxCoord();
        double yThree = triangle.getThirdPoint().getyCoord();
        double legOne = Math.sqrt((xTwo-xOne)*(xTwo-xOne)+(yTwo-yOne)*(yTwo-yOne));
        double legTwo = Math.sqrt((xThree-xTwo)*(xThree-xTwo)+(yThree-yTwo)*(yThree-yTwo));
        double legThree = Math.sqrt((xOne-xThree)*(xOne-xThree)+(yOne-yThree)*(yOne-yThree));
        if ((legOne * legOne) + (legTwo * legTwo) == (legThree * legThree) || (legOne * legOne) + (legThree * legThree) == (legTwo * legTwo) || (legTwo * legTwo) + (legThree * legThree) == (legOne * legOne)) {
            return "Triangle is rectangular";
        } else if ((legOne * legOne) + (legTwo * legTwo) < (legThree * legThree) || (legOne * legOne) + (legThree * legThree) < (legTwo * legTwo) || (legTwo * legTwo) + (legThree * legThree) < (legOne * legOne)) {
            return "Triangle is obtuse";
        } else if ((legOne * legOne) + (legTwo * legTwo) > (legThree * legThree) && (legOne * legOne) + (legThree * legThree) > (legTwo * legTwo) && (legTwo * legTwo) + (legThree * legThree) > (legOne * legOne)) {
            return "Triangle is acute-angled";
        }
        return "Triangle does not exist";
    }

    public String checkTriangleType(Triangle triangle) {
            double xOne = triangle.getFirstPoint().getxCoord();
            double yOne = triangle.getFirstPoint().getyCoord();
            double xTwo = triangle.getSecondPoint().getxCoord();
            double yTwo = triangle.getSecondPoint().getyCoord();
            double xThree = triangle.getThirdPoint().getxCoord();
            double yThree = triangle.getThirdPoint().getyCoord();
            double legOne = Math.sqrt((xTwo-xOne)*(xTwo-xOne)+(yTwo-yOne)*(yTwo-yOne));
            double legTwo = Math.sqrt((xThree-xTwo)*(xThree-xTwo)+(yThree-yTwo)*(yThree-yTwo));
            double legThree = Math.sqrt((xOne-xThree)*(xOne-xThree)+(yOne-yThree)*(yOne-yThree));
        if (legOne == legTwo && legTwo == legThree) {
            return "Triangle is equilateral";
        } else if (legOne == legTwo || legTwo == legThree || legThree == legOne) {
            return "Triangle is isosceles";
        } else if (legOne != legTwo && legTwo != legThree && legThree != legOne) {
            return "Triangle is versatile";
        }
        return "Triangle does not exist";
    }
}

