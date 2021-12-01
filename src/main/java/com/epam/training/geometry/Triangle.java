package com.epam.training.geometry;

public class Triangle {

    private final Point firstPoint;
    private final Point secondPoint;
    private final Point thirdPoint;
/*    private double firstLeg;
    private double secondLeg;
    private double thirdLeg;*/

        public Triangle(Point firstPoint, Point secondPoint, Point thirdPoint){
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Triangle triangle = (Triangle) o;
        return firstPoint.equals(triangle.firstPoint) && secondPoint.equals(triangle.secondPoint) && thirdPoint.equals(triangle.thirdPoint);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 3;
        result = prime * result + firstPoint.hashCode();
        result = prime * result + secondPoint.hashCode();
        result = prime * result + thirdPoint.hashCode();
        return result;
    }



}

