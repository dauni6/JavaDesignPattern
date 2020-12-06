package com.example.javadesignpattern.adapter.practice1;

/**
 * Coffee 클래스는 미리 제공되어있는 클래스로 가정
 **/
public class Coffee {
    private String coffee;

    public Coffee(String coffee) {
        this.coffee = coffee;
    }

    public void provideCoffeePowder() {
        System.out.println("사용된 커피원두는 " + coffee + " 이고 분말형태로 제공됩니다.");
    }

}
