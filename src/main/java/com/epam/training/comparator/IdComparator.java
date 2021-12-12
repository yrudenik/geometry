package com.epam.training.comparator;

import com.epam.training.TriangleIdentifiable;

import java.util.Comparator;

public class IdComparator implements Comparator<TriangleIdentifiable> {

    @Override
    public int compare(TriangleIdentifiable o1, TriangleIdentifiable o2) {
        if (o1.getId() > o2.getId()) {
            return 1;
        } else {
            return 0;
        }
    }
}
