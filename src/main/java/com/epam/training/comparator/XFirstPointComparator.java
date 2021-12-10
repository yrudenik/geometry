package com.epam.training.comparator;

import com.epam.training.TriangleIdentifiable;

import java.util.Comparator;

public class XFirstPointComparator implements Comparator<TriangleIdentifiable> {

    @Override
    public int compare(TriangleIdentifiable o1, TriangleIdentifiable o2) {
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
