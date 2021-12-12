package com.epam.training.comparator;

import com.epam.training.TriangleIdentifiable;

import java.util.Comparator;

public class XThirdPointComparator implements Comparator<TriangleIdentifiable> {

    @Override
    public int compare(TriangleIdentifiable o1, TriangleIdentifiable o2) {
        if (o1.getThirdPoint().getxCoord() == o2.getThirdPoint().getxCoord()) {
            return 0;
        }
        if (o1.getThirdPoint().getxCoord() > o2.getThirdPoint().getxCoord()) {
            return 1;
        } else {
            return -1;
        }
    }
}