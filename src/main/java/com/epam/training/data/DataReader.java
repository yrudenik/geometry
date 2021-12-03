package com.epam.training.data;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DataReader {

    public List<String> read(String filePath) throws DataException {
        List<String> lines = new ArrayList<>();
        try {
            BufferedReader buffReader = new BufferedReader(new FileReader(filePath));
            String line = buffReader.readLine();
            while (line != null) {
                lines.add(line);
                line = buffReader.readLine();
            }
        } catch (FileNotFoundException e) {
            throw new DataException("File not found", e);
        } catch (IOException e) {
            throw new DataException("Incorrect information", e);
        }
        return lines;
    }
}


