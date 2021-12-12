package com.epam.training.logic;

import com.epam.training.data.DataException;
import com.epam.training.data.DataReader;
import com.epam.training.geometry.Triangle;
import com.epam.training.geometry.TriangleCreator;
import com.epam.training.geometry.TriangleValidator;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;

public class DirectorTest {

    public final static String TEST_PATH = "filePath";
    public final static String VALID_LINE = "2.0 2.0 5.0 2.0 1.0 6.0";
    public final static String INVALID_LINE = "z1.0 2.x0 y5.0 2.0 4.0 4.0";
    private final static Triangle TRIANGLE = Mockito.mock(Triangle.class);

    @Test
    public void testReadLinesShouldCreateWhenDataIsValid() throws DataException {

        //given
        DataReader reader = Mockito.mock(DataReader.class);
        Mockito.when(reader.read(TEST_PATH)).thenReturn(Arrays.asList(VALID_LINE));

        TriangleValidator validator = Mockito.mock(TriangleValidator.class);
        Mockito.when(validator.isValid(VALID_LINE)).thenReturn(true);
        Mockito.when(validator.isPointsFormTriangle(VALID_LINE)).thenReturn(true);

        TriangleCreator creator = Mockito.mock(TriangleCreator.class);
        Mockito.when(creator.create(VALID_LINE)).thenReturn(TRIANGLE);

        Director director = new Director(reader, validator, creator);

        //when
        List<Triangle> triangles = director.read(TEST_PATH);

        //then
        Assert.assertEquals(Arrays.asList(TRIANGLE), triangles);

        verify(reader, times(1)).read(TEST_PATH);
        verify(validator, times(1)).isValid(VALID_LINE);
        verify(validator, times(1)).isPointsFormTriangle(VALID_LINE);
        verify(creator, times(1)).create(VALID_LINE);
        verifyNoMoreInteractions(reader, validator, creator);
    }

    @Test
    public void testReadLinesShouldCreateWhenDataIsInvalid() throws DataException {

        //given
        DataReader reader = Mockito.mock(DataReader.class);
        Mockito.when(reader.read(TEST_PATH)).thenReturn(Arrays.asList(INVALID_LINE));

        TriangleValidator validator = Mockito.mock(TriangleValidator.class);
        Mockito.when(validator.isValid(INVALID_LINE)).thenReturn(false);
        Mockito.when(validator.isPointsFormTriangle(VALID_LINE)).thenReturn(true);

        TriangleCreator creator = Mockito.mock(TriangleCreator.class);

        Director director = new Director(reader, validator, creator);

        //when
        List<Triangle> triangles = director.read(TEST_PATH);

        //then
        Assert.assertTrue(triangles.isEmpty());

        verify(reader).read(TEST_PATH);
        verify(validator).isValid(INVALID_LINE);
        verifyNoMoreInteractions(reader, validator, creator);
    }
}