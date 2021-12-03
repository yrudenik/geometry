package com.epam.training.geometry;

import org.junit.Assert;
import org.junit.Test;

public class TriangleCreatorTest {

    @Test
    public void testCreateTriangleShouldCreateTriangleWhenDataIsValid(){
        //given
        Triangle triangle = new Triangle(new Point(2.0, 2.0), new Point(8.0, 2.0), new Point(5.0, 7.0));
        TriangleCreator trianglecreator = new TriangleCreator();
        String lineTest = "2.0 2.0 8.0 2.0 5.0 7.0";

        //when
        Triangle resultTriangle = trianglecreator.create(lineTest);

        //then
        Assert.assertEquals(triangle, resultTriangle);
    }
}
