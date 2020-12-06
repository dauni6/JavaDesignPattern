package com.example.javadesignpattern.adapter.problem;

import java.io.IOException;

/**
 * 예를들면 직류 12볼트에 해당하는 인터페이스가 FileIO 인터페이스이다.
 **/
public interface FileIO {
    public abstract void readFromFile(String filename) throws IOException;
    public abstract void writeToFile(String filename) throws IOException;
    public abstract void setValue(String key, String value);
    public abstract String getValue(String key);
}
