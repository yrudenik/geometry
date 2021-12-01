package com.epam.training.geometry;

import org.junit.Assert;
import org.junit.Test;

public class TriangleCreatorTest {

    @Test
    public void testCreateTriangleShouldCreateTriangleWhenDataIsValid(){
        //given
        Point firstP = new Point(2.0, 2.0);
        Point secondP = new Point(8.0, 2.0);
        Point thirdP = new Point(5.0, 7.0);
        Triangle triangle = new Triangle(firstP, secondP, thirdP);
        TriangleCreator trianglecreator = new TriangleCreator();
        String lineTest = "2.0 2.0 8.0 2.0 5.0 7.0";

        //when
        Triangle resultTriangle = trianglecreator.create(lineTest);

        //then
        Assert.assertEquals(triangle, resultTriangle);
    }
}
