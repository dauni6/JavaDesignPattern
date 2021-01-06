package com.example.javadesignpattern.builder;

public class TextBuilder extends Builder{
    private StringBuffer buffer = new StringBuffer();

    @Override
    public void makeTitle(String title) {
        buffer.append("===================\n"); // 장식선
        buffer.append("[").append(title).append("]\n"); // [] 사용한 타이틀
        buffer.append("\n");
    }

    @Override
    public void makeString(String str) {
        buffer.append("ㅁ").append(str).append("\n");
    }

    @Override
    public void makeItems(String[] items) {
        for (int i = 0; i < items.length; i++) {
            buffer.append(" .").append(items[i]).append("\n");
        }
        buffer.append("\n");
    }

    @Override
    public void close() {
        buffer.append("===================\n");
    }

    public String getResult() {
        return buffer.toString(); // StringBuffer를 String으로 변환
    }

}
