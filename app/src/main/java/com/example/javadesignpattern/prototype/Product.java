package com.example.javadesignpattern.prototype;

public interface Product extends Cloneable { // Cloneable을 상속받고 Product를 구현하고 있는 클래스의 인스턴스는 clone 메소드를 사용해서 자동적으로 복제가 가능
    public abstract void use(String s);

    public abstract Product createClone();
}
