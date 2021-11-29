package com.epam.training.geometry;

public class Point {

    private final double xCoord;
    private final double yCoord;

    public double getxCoord() {
        return xCoord;
    }

    public double getyCoord() {
        return yCoord;
    }

    Point (double xCoord, double yCoord){
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }
}

