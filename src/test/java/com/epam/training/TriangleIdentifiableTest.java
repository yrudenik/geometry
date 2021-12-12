package com.epam.training;

import com.epam.training.geometry.Point;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class TriangleIdentifiableTest {

    private static final double DELTA = 0.001;

    @Test
    public void testNotifyObserversShouldUpdateAreaWhenPointChanged(){
        //given
        TriangleIdentifiable triangle = new TriangleIdentifiable(123, new Point(1.0 , 1.0), new Point(6.0 , 1.0), new Point(6.0, 5.0));
        TriangleStore store = TriangleStore.getInstance();
        triangle.attach(store);

        //when
        triangle.setFirstPoint(new Point(5.0, 1.0));

        //then
        Map<Integer, Parameters> resultParameters = store.getParameters();
        Parameters resultOb = resultParameters.get(123);
        double result = resultOb.getArea();
        Assert.assertEquals(2.0, result, DELTA);
    }
}
