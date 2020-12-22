package com.example.javadesignpattern.prototype;

import java.util.HashMap;

/**
 * Product 인터페이스를 이용해서 인스턴스의 복제를 실행하는 클래스
 **/
public class Manager {
    private HashMap showcase = new HashMap();

    public void register(String name, Product proto) {
        showcase.put(name, proto);
    }

    public Product create(String protoname) {
        Product p = (Product) showcase.get(protoname);
        return p.createClone();
    }

}
