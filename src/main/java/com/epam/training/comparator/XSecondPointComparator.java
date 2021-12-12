package com.epam.training.comparator;

import com.epam.training.TriangleIdentifiable;

import java.util.Comparator;

public class XSecondPointComparator implements Comparator<TriangleIdentifiable> {

    @Override
    public int compare(TriangleIdentifiable o1, TriangleIdentifiable o2) {
        if (o1.getSecondPoint().getxCoord() == o2.getSecondPoint().getxCoord()) {
            return 0;
        }
        if (o1.getSecondPoint().getxCoord() > o2.getSecondPoint().getxCoord()) {
            return 1;
        } else {
            return -1;
        }
    }
}