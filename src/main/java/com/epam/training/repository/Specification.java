package com.epam.training.repository;

import com.epam.training.TriangleIdentifiable;

public interface Specification {

    boolean specified(TriangleIdentifiable triangle);
}
