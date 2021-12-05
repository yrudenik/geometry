package com.epam.training.repository;

import com.epam.training.TriangleObservable;

import java.util.Comparator;
import java.util.List;

public interface TriangleRepository {

    void add(TriangleObservable triangle);
    void delete (TriangleObservable triangle);
    void update (TriangleObservable triangle);

    List<TriangleObservable> query(Specification specification);

    List<TriangleObservable> sort(Comparator<TriangleObservable> comparator);
    
}
