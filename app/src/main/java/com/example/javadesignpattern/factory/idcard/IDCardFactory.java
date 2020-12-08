package com.example.javadesignpattern.factory.idcard;

import com.example.javadesignpattern.factory.framework.Factory;
import com.example.javadesignpattern.factory.framework.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

/**
 * createProduct와 registerProduct 두 가지 메소드를 구현하는 클래스
 **/
public class IDCardFactory extends Factory {
    private HashMap database = new HashMap();
    private int serial = 100;

    @Override
    protected synchronized Product createProduct(String owner) {
        return new IDCard(owner, serial++);
    }

    @Override
    protected void registerProduct(Product product) {
        IDCard card = (IDCard)product;
        database.put(new Integer(card.getSerial()), card.getOwner());
    }

    public HashMap getDatabase() {
        return database;
    }

}
