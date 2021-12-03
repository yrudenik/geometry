package com.epam.training.data;

import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

public class DataReaderTest {

    @Test
    public void testReadFileShouldReadWhenFileHasOneLine() throws DataException {
        //given
        DataReader dataReader = new DataReader();

        //when
        List<String> resultLines = dataReader.read("src/main/resources/InputOneLine");

        //then
        Assert.assertEquals(Arrays.asList("2.0 2.0 5.0 2.0 1.0 6.0"), resultLines);
    }

    @Test
    public void testReadFileShouldReadWhenFileHasManyLines() throws DataException {
        //given
        DataReader dataReader = new DataReader();
        List expectedLines = Arrays.asList("1.0 1.0 3.0 1.0 2.0 3.0", "2.0z 2.0y x5.0 2.0 1.0 6.0", "epam training", "1.0 2.0 3.0 4.0 5.0 6.0");

        //when
        List<String> resultLines = dataReader.read("src/main/resources/InputManyLines");

        //then
        Assert.assertEquals(expectedLines, resultLines);
    }
}
