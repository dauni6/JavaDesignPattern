package com.example.javadesignpattern.adapter.problem;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * FileProperties 클래스가 어댑터의 역할
 * Properties 클래스가 교류 100볼트 역할
 * FileIO 인터페이스가 직류 12볼트 역할
 **/
public class FileProperties extends Properties implements FileIO {

    @Override
    public void readFromFile(String filename) throws IOException {
        load(new FileInputStream(filename));
    }

    @Override
    public void writeToFile(String filename) throws IOException {
        store(new FileOutputStream(filename), "written by FileProperties");
    }

    @Override
    public void setValue(String key, String value) {
        setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return getValue(key);
    }

}
