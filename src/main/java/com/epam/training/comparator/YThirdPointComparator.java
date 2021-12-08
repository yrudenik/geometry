package com.epam.training.comparator;

import com.epam.training.TriangleObservable;

import java.util.Comparator;

public class YThirdPointComparator implements Comparator<TriangleObservable> {

    @Override
    public int compare(TriangleObservable o1, TriangleObservable o2) {
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
