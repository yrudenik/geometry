package com.epam.training.repository;

import com.epam.training.TriangleIdentifiable;
import com.epam.training.geometry.Point;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TriangleRepositoryImplTest {

    @Test
    public void testQueryShouldReturnTriangleWhenIdMatches() {
        //given
        TriangleIdentifiable firstTriangle = new TriangleIdentifiable(111, new Point(1.0, 1.0), new Point(5.0, 1.0), new Point(6.0, 5.0));
        TriangleIdentifiable secondTriangle = new TriangleIdentifiable(222, new Point(0.0, 0.0), new Point(1.0, 0.0), new Point(0.0, 1.0));
        TriangleRepositoryImpl repository = new TriangleRepositoryImpl();
        repository.add(firstTriangle);
        repository.add(secondTriangle);

        //when
        List<TriangleIdentifiable> idQuery = repository.query(new IdSpecification(222));

        //then
        Assert.assertEquals(Arrays.asList(secondTriangle), idQuery);
    }

    @Test
    public void testQueryShouldReturnTriangleWhenAreaMatchesRange() {
        //given
        TriangleIdentifiable firstTriangle = new TriangleIdentifiable(111, new Point(1.0, 1.0), new Point(5.0, 1.0), new Point(6.0, 5.0));
        TriangleIdentifiable secondTriangle = new TriangleIdentifiable(222, new Point(0.0, 0.0), new Point(1.0, 0.0), new Point(0.0, 1.0));
        TriangleRepositoryImpl repository = new TriangleRepositoryImpl();
        repository.add(firstTriangle);
        repository.add(secondTriangle);

        //when
        List<TriangleIdentifiable> queryRange = repository.query(new AreaSpecification(5.0, 25.0));

        //then
        Assert.assertEquals(Arrays.asList(firstTriangle), queryRange);
    }

    @Test
    public void testQueryShouldReturnTriangleWhenPerimeterMatchesRange() {
        //given
        TriangleIdentifiable firstTriangle = new TriangleIdentifiable(111, new Point(1.0, 1.0), new Point(5.0, 1.0), new Point(6.0, 5.0));
        TriangleIdentifiable secondTriangle = new TriangleIdentifiable(222, new Point(0.0, 0.0), new Point(10.0, 0.0), new Point(10.0, 20.0));
        TriangleRepositoryImpl repository = new TriangleRepositoryImpl();
        repository.add(firstTriangle);
        repository.add(secondTriangle);

        //when
        List<TriangleIdentifiable> queryRange = repository.query(new PerimeterSpecification(15.0, 55.0));

        //then
        Assert.assertEquals(Arrays.asList(secondTriangle), queryRange);
    }
}
