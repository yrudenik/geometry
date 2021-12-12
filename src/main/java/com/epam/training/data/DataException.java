package com.epam.training.data;

public class DataException extends Exception{

    public DataException (String textOfException, Throwable typeOfException){
        super(textOfException, typeOfException);
    }
}
