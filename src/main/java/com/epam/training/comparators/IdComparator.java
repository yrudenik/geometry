package com.epam.training.comparators;

import com.epam.training.TriangleObservable;

import java.util.Comparator;

public class IdComparator implements Comparator<TriangleObservable> {

    @Override
    public int compare(TriangleObservable o1, TriangleObservable o2) {
        if (o1.getId() > o2.getId()) {
            return 1;
        } else {
            return 0;
        }
    }
}
