package com.example.javadesignpattern.adapter;

/**
 * Banner 클래스는 미리 제공되어있는 클래스로 가정
 **/
public class Banner {
    private String string;

    public Banner(String string) {
        this.string = string;
    }

    public void showWithParen() {
        System.out.println("(" + string + ")");
    }

    public void showWithAster() {
        System.out.println("*" + string + "*");
    }

}
