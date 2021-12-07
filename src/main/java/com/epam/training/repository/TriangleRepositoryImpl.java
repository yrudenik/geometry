package com.epam.training.repository;

import com.epam.training.TriangleObservable;
import com.epam.training.comparators.IdComparator;
import com.epam.training.geometry.Triangle;

import java.util.*;

public class TriangleRepositoryImpl implements TriangleRepository {

    private final Map<Integer, TriangleObservable> store = new HashMap<>();

    public void add(Triangle triangle) {
    }

    @Override
    public void add(TriangleObservable triangle) {
    }

    @Override
    public void delete(TriangleObservable triangle) {
    }

    @Override
    public void update(TriangleObservable triangle) {
    }

    public List<TriangleObservable> query(final Specification specification) {
        List<TriangleObservable> triangles = new ArrayList<>();
        for (TriangleObservable triangle : triangles) {
            if (specification.specified(triangle)) {
                triangles.add(triangle);
            }
        }
        return triangles;
    }

    @Override
    public List<TriangleObservable> sort(Comparator<TriangleObservable> comparator) {
        return null;
    }
/*    ArrayList<Integer> newList = new ArrayList<Integer>(parameters.keySet());
    IdComparator idComparator = new IdComparator();
    newList.*/




}
