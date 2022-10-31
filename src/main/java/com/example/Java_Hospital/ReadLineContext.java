package com.example.Java_Hospital;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadLineContext {
    private Parser<T> parser;

    public ReadLineContext(Parser<T> parser) {
        this.parser = parser;
    }

    public List<T> readByLine(String filename) throws IOException {
        // 삽
        List<T> result = new ArrayList<>();
        BufferedReader reader = new BufferedReader(
                new FileReader(filename)
        );
        String str;
        while ((str = reader.readLine()) != null) {
            result.add(parser.parse(str));
        }
        reader.close();
        return result;
}
