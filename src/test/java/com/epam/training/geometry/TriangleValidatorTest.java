package com.epam.training.geometry;

import org.junit.Assert;
import org.junit.Test;

public class TriangleValidatorTest {

    @Test
    public void testIsValidShouldBeTrueWhenDataIsValid(){
        //given
        TriangleValidator triangleValidator = new TriangleValidator();
        String lineIsValid = "1.0 2.0 1.0 3.0 5.0 8.0";

        //when
        boolean resultValidotor = triangleValidator.isValid(lineIsValid);

        //then
        Assert.assertEquals(true, resultValidotor);
    }

    @Test
    public void testIsValidShouldBeFalseWhenDataIsInvalid(){
        //given
        TriangleValidator triangleValidator = new TriangleValidator();
        String lineIsValid = "1.0z 2.0 1.0 3.0-5.0 8.0";

        //when
        boolean resultValidotor = triangleValidator.isValid(lineIsValid);

        //then
        Assert.assertEquals(false, resultValidotor);
    }
}
