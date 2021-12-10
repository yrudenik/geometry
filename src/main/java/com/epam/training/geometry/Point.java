package com.epam.training.geometry;

public final class Point {

    private final double xCoord;
    private final double yCoord;

    public double getxCoord() {
        return xCoord;
    }

    public double getyCoord() {
        return yCoord;
    }

    public Point(double xCoord, double yCoord) {
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Point point = (Point) o;
        return Double.compare(point.xCoord, xCoord) == 0 && Double.compare(point.yCoord, yCoord) == 0;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 17;
        result = prime * result + (int) xCoord;
        result = prime * result + (int) yCoord;
        return result;
    }
}

