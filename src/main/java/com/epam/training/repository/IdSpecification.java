package com.epam.training.repository;

import com.epam.training.TriangleObservable;

public class IdSpecification implements Specification {

    private final Integer id;

    public IdSpecification(final Integer id) {
        this.id = id;
    }

    @Override
    public boolean specified(final TriangleObservable triangle) {
        return triangle.getId().equals(id);
    }
}
