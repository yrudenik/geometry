package com.epam.training.geometry;

public class Triangle {

    private final Point firstPoint;
    private final Point secondPoint;
    private final Point thirdPoint;
/*    private double firstLeg;
    private double secondLeg;
    private double thirdLeg;*/

        Triangle(Point firstPoint, Point secondPoint, Point thirdPoint){
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
        this.thirdPoint = thirdPoint;
    }

    public Point getFirstPoint() {
            return firstPoint;
    }

    public Point getSecondPoint() {
            return secondPoint;
    }

    public Point getThirdPoint() {
        return thirdPoint;
    }
}
