package com.epam.training.comparator;

import com.epam.training.TriangleObservable;

import java.util.Comparator;

public class XFirstPointComparator implements Comparator<TriangleObservable> {

    @Override
    public int compare(TriangleObservable o1, TriangleObservable o2) {
        if (o1.getFirstPoint().getxCoord() == o2.getFirstPoint().getxCoord()) {
            return 0;
        }
        if (o1.getFirstPoint().getxCoord() > o2.getFirstPoint().getxCoord()) {
            return 1;
        } else {
            return -1;
        }
    }
}
