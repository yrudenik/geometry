package com.epam.training.comparator;

import com.epam.training.TriangleIdentifiable;

import java.util.Comparator;

public class YThirdPointComparator implements Comparator<TriangleIdentifiable> {

    @Override
    public int compare(TriangleIdentifiable o1, TriangleIdentifiable o2) {
        if (o1.getThirdPoint().getyCoord() == o2.getThirdPoint().getyCoord()) {
            return 0;
        }
        if (o1.getThirdPoint().getyCoord() > o2.getThirdPoint().getyCoord()) {
            return 1;
        } else {
            return -1;
        }
    }
}
