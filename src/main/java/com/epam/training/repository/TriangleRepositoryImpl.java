package com.epam.training.repository;

import com.epam.training.TriangleIdentifiable;
import java.util.*;

public class TriangleRepositoryImpl implements TriangleRepository {

    private final Map<Integer, TriangleIdentifiable> store = new HashMap<>();

    @Override
    public void add(TriangleIdentifiable triangle) {
        Integer id = triangle.getId();
        store.put(id,triangle);
    }

    @Override
    public void delete(TriangleIdentifiable triangle) {
        Integer id = triangle.getId();
        store.remove(id,triangle);
    }

    @Override
    public void update(TriangleIdentifiable triangle) {
        Integer id = triangle.getId();
        store.put(id, triangle);
    }

    @Override
    public List<TriangleIdentifiable> query(final Specification specification) {
        List<TriangleIdentifiable> triangles = new ArrayList<>();
        for (TriangleIdentifiable triangle : store.values()) {
            if (specification.specified(triangle)) {
                triangles.add(triangle);
            }
        }
        return triangles;
    }

    @Override
    public List<TriangleIdentifiable> sort(Comparator<TriangleIdentifiable> comparator) {
        List<TriangleIdentifiable> trianglesList = new ArrayList<>(store.values());
        trianglesList.sort(comparator);
        return trianglesList;
    }
}
