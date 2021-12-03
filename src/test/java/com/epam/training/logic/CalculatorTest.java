package com.epam.training.logic;

import com.epam.training.geometry.Point;
import com.epam.training.geometry.Triangle;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testCalculatePerimeterShouldCalculatePerWhenTriangleIsValid(){
        //given
        Calculator calculator = new Calculator();
        Point firstP = new Point(2.0, 1.0);
        Point secondP = new Point(6.0, 1.0);
        Point thirdP = new Point(6.0, 4.0);
        Triangle triangle = new Triangle(firstP, secondP, thirdP);

        //when
        double result = calculator.calculatePerimeter(triangle);

        //then
        //Assert.assertEquals(Double.doubleToLongBits(12.0), Double.doubleToLongBits(result));
        Assert.assertEquals(12.0, result, 0.000001);
    }

    @Test
    public void testCalculateAreaShouldCalculateAreaWhenTriangleIsValid(){
        //given
        Calculator calculator = new Calculator();
        Point firstP = new Point(2.0, 1.0);
        Point secondP = new Point(6.0, 1.0);
        Point thirdP = new Point(6.0, 4.0);
        Triangle triangle = new Triangle(firstP, secondP, thirdP);

        //when
        double result = calculator.calculateArea(triangle);

        //then
        Assert.assertEquals(6.0, result, 0.000001);
    }

    @Test
    public void testDefineAngleTypeShouldDefineAngleTypeWhenTriangleIsValid(){
        //given
        Calculator calculator = new Calculator();
        Point firstP = new Point(2.0, 1.0);
        Point secondP = new Point(5.0, 1.0);
        Point thirdP = new Point(6.0, 4.0);
        Triangle triangle = new Triangle(firstP, secondP, thirdP);

        //when
        String result = calculator.checkAngleType(triangle);

        //then
        Assert.assertEquals("Triangle is obtuse", result);
    }

    @Test
    public void testDefineTriangleTypeShouldDefineTriangleTypeWhenTriangleIsValid(){
        //given
        Calculator calculator = new Calculator();
        Point firstP = new Point(2.0, 2.0);
        Point secondP = new Point(8.0, 2.0);
        Point thirdP = new Point(5.0, 7.0);
        Triangle triangle = new Triangle(firstP, secondP, thirdP);

        //when
        String result = calculator.checkTriangleType(triangle);

        //then
        Assert.assertEquals("Triangle is isosceles", result);
    }
}
