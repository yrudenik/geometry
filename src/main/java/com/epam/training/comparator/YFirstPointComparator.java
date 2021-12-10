package com.epam.training.comparator;

import com.epam.training.TriangleIdentifiable;

import java.util.Comparator;

public class YFirstPointComparator implements Comparator<TriangleIdentifiable> {

    @Override
    public int compare(TriangleIdentifiable o1, TriangleIdentifiable o2) {
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
