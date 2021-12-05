package com.epam.training.repository;

import com.epam.training.TriangleObservable;
import com.epam.training.geometry.Triangle;

public interface Specification {

    boolean specified(TriangleObservable triangle);
}
