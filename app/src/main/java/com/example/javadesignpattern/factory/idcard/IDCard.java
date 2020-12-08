package com.example.javadesignpattern.factory.idcard;

import com.example.javadesignpattern.factory.framework.Product;

/**
 * 인식번호 카드를 나타내는 클래스
 * Product의 하위 클래스로 지정
 **/
public class IDCard extends Product {
    private String owner;
    private int serial;

    IDCard(String owner, int serial) {
        System.out.println(owner + "<" + serial + ">의 카드를 만듭니다.");
        this.owner = owner;
        this.serial = serial;
    }

    @Override
    public void use() {
        System.out.println(owner + "<" + serial + ">의 카드를 사용합니다.");
    }

    public String getOwner() {
        return owner;
    }

    public int getSerial() {
        return serial;
    }

}
