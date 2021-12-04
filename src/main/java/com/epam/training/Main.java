package com.epam.training;

import com.epam.training.geometry.Point;

public class Main {

    public static void main(String[] args) {
        TriangleObservable triangle = new TriangleObservable(1, new Point(2.0, 1.0), new Point(6.0, 1.0), new Point(6.0, 4.0));
        TriangleStore store = TriangleStore.getInstance();
        triangle.attach(store);

        triangle.setFirstPoint(new Point(4.0, 1.0));
    }
}
