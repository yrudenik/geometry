package com.epam.training.comparators;

import com.epam.training.TriangleObservable;

import java.util.Comparator;

public class YFirstPointComparator implements Comparator<TriangleObservable> {

    @Override
    public int compare(TriangleObservable o1, TriangleObservable o2) {
        if (o1.getFirstPoint().getyCoord() == o2.getFirstPoint().getyCoord()) {
            return 0;
        }
        if (o1.getFirstPoint().getyCoord() > o2.getFirstPoint().getyCoord()) {
            return 1;
        } else {
            return -1;
        }
    }
}
