package com.epam.training.data;

import org.junit.Test;

import java.util.List;

public class DataExceptionTest {

    @Test
    public void testThrowExceptionShouldThrowWhenFileDoesNotFound() throws DataException {
        //given
        DataReader dataReader = new DataReader();

        //when
        List<String> resultLines = dataReader.read("src/test/resources/File do not exist");

        //then
    }
}
