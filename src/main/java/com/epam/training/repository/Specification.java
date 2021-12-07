package com.epam.training.repository;

import com.epam.training.TriangleObservable;

public interface Specification {

    boolean specified(TriangleObservable triangle);
}
